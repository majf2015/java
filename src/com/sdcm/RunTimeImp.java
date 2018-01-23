package com.sdcm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/20.
 */


@Component
public class RunTimeImp implements RunTimeValue {
    private String string;

    public RunTimeImp(@Value("${run.string}") String string) {
        this.string = string;
    }

    @Override
    public void show() {
        System.out.println("RunTimeImp.show: " + this.string);
    }
}
