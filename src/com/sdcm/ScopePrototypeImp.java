package com.sdcm;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/20.
 */


@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopePrototypeImp implements ScopePrototype {
    @Override
    public void show() {
        System.out.println("ScopePrototype.show");
    }
}
