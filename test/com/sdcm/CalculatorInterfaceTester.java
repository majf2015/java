package com.sdcm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2017/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScanConfig.class)
public class CalculatorInterfaceTester {

    @Autowired
    private CalculatorInterface calculator;

    @Test
    public void testCalculator() {
        assertNotNull(calculator);
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

}
