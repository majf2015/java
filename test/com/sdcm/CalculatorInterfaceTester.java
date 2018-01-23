package com.sdcm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import config.ScanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Created by Administrator on 2017/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ScanConfig.class)
@ContextConfiguration(locations = "classpath*:rules/spring_prj.xml")
public class CalculatorInterfaceTester {

    @Autowired
    private CalculatorInterface calculator;

    @Autowired
    //接口有多个实现类时，需要说明是使用了哪个实现类的bean
    @Qualifier("anotherAddInterfaceImp")
    private AddInterface antheradd;

    @Autowired
    @Qualifier("addInterfaceImp")
    private AddInterface addagain;

    @Autowired
    private SubtractInterface anthersubtract;

    @Test
    public void testCalculator() {
        assertNotNull(calculator);
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testAnotheradd() {
        assertEquals(3,antheradd.add(2,1));
    }

    @Test
    public  void testAddagain() {
        assertEquals(6,addagain.add(4,2));
    }

    @Test
    public void testAnothersubtract() {
        assertEquals(3,anthersubtract.subtract(4,1));
    }

}
