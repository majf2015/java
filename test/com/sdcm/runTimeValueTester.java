package com.sdcm;

import config.RunTimeValueConfig;
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
@ContextConfiguration(classes = RunTimeValueConfig.class)
//@ContextConfiguration(locations = "classpath*:/rules/run_time_value.xml")
public class runTimeValueTester {
    //private String string;

    @Autowired
    @Qualifier("runTimeImp")
    private RunTimeValue value;

    @Test
    public void testRunTimeValue() {
        value.show();
    }
}
