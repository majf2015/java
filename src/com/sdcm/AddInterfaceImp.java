package com.sdcm;

import org.springframework.stereotype.Component;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.xml.soap.SOAPPart;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/3.
 */

@Component
public class AddInterfaceImp implements AddInterface{
    private int left;
    private int right;
    private Set<Integer> list;


    public AddInterfaceImp(int left, int right,Set<Integer> list) {
        this.left = left;
        this.right = right;
        this.list = list;
    }
    public int add(int left, int right) {
        System.out.println(list.size());
        System.out.println("AddInterfaceImp");
        return left + right;

    }
}
