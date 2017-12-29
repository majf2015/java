package com.sdcm;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/5.
 */

@Component("CalculatorInterface")
public class CalculatorInterfaceImp implements CalculatorInterface {

    public  int add(int left, int right) {
        return left + right;
    }

    public int subtract(int left, int right) {
        return left - right;
    }

    public int multiply(int left, int right) {
        return left * right;
    }

    public int divide(int left, int right) {
        return left / right;
    }

}
