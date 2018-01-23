package com.sdcm;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/20.
 */


@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopeSessionImp implements ScopeSession {
    @Override
    public void show() {
        System.out.println("ScopeSessionImp.show");
    }
}
