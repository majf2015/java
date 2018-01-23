package com.sdcm;

import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2018/1/3.
 */

@Component
public class AnotherAddInterfaceImp implements AddInterface{
    private int left;
    private int right;
    private Set<Integer> list;

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setList(Set<Integer> list) {
        this.list = list;
    }

    public int add(int left, int right) {
        System.out.println(list.size());
        System.out.println("AnotherAddInterfaceImp");
        return left + right;
    }
}
