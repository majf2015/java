package com.sdcm;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2018/1/23.
 */
public class SpELImp implements SpEL {
    private String string;

    public SpELImp(@Value("#{'run.string'}") String string) {
        this.string = string;
    }

    @Override
    public void show() {
        System.out.println("SpELImp.show: " + this.string);
    }
}
