package com.sdcm;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/20.
 */


@Component
public class RunTimeValueImp implements RunTimeValue {
    private String string;

    public RunTimeValueImp (String string) {
        this.string = string;
    }

    @Override
    public void show() {
        System.out.println("RunTimeValueImp.show: " + this.string);
    }
}
