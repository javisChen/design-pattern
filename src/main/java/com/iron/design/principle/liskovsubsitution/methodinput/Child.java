package com.iron.design.principle.liskovsubsitution.methodinput;

import java.util.HashMap;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-10
 * @time 13:50
 */
public class Child extends Base {

    @Override
    public void method(HashMap map) {
        super.method(map);
        System.out.println("子类HashMap入参方法被执行");
    }
}
