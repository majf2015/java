package com.sdcm;

import config.ScopeConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AbstractTestExecutionListener;



/**
 * Created by Administrator on 2017/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ScopeConfig.class)
@ContextConfiguration(locations = "classpath*:rules/scope_spring.xml")
public class scopTester {

    @Autowired
    private ScopeSingleton singleton;
    @Autowired
    private ScopePrototype prototype;
//    @Autowired
//    private ScopeSession session;
//    @Autowired
//    private ScopeRequest request;

    @Test
    public void testSingleton() {
        singleton.show();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());
    }
    @Test
    public void testSingletonAgain() {
        singleton.show();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());

    }

    @Test
    public void testPrototype() {
        prototype.show();
        System.out.println(prototype.hashCode());
        System.out.println(prototype.hashCode());
    }

    @Test
    public void testPrototypeAgain() {
        prototype.show();
        System.out.println(prototype.hashCode());
        System.out.println(prototype.hashCode());
    }

//    @Test
//    public void testSession() {
//        session.show();
//        System.out.println(session.hashCode());
//        System.out.println(session.hashCode());
//    }
//
//    @Test
//    public void testSessionAgain() {
//        session.show();
//        System.out.println(session.hashCode());
//        System.out.println(session.hashCode());
//    }
////
////    @Test
//    public void testRequest() {
//        request.show();
//        System.out.println(request.hashCode());
//        System.out.println(request.hashCode());
//    }
//
//   @Test
//    public void testRequestAgain() {
//        request.show();
//        System.out.println(request.hashCode());
//        System.out.println(request.hashCode());
//    }
}
