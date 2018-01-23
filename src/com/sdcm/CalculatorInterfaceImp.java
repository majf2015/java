package com.sdcm;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/5.
 */

@Component("calculator")
public class CalculatorInterfaceImp implements CalculatorInterface {

    public  int add(int left, int right) {
        System.out.println("CalculatorInterfaceImp:add");
        return left + right;
    }

    public int subtract(int left, int right) {
        System.out.println("CalculatorInterfaceImp:subtract");
        return left - right;
    }

    public int multiply(int left, int right) {
        System.out.println("CalculatorInterfaceImp:multiply");
        return left * right;
    }

    public int divide(int left, int right) {
        System.out.println("CalculatorInterfaceImp:divide");
        return left / right;
    }

}
