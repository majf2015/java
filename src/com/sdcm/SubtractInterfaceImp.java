package com.sdcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Created by Administrator on 2018/1/3.
 */

@Component
public class  SubtractInterfaceImp implements SubtractInterface{
    private  CalculatorInterface  sub;
    //通过构造器注入其他类
//    @Autowired
//    public SubtractInterfaceImp(CalculatorInterface sub) {
//        this.sub = sub;
//    }

//通过setter方法注入其他类
//    @Autowired
    public void setSub(CalculatorInterface sub) {
        this.sub = sub;
    }

    public int subtract(int left, int right) {
        System.out.println("SubtractInterfaceImp");
        return sub.subtract(left ,right);
    }
}
