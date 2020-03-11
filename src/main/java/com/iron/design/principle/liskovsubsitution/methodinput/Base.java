package com.iron.design.principle.liskovsubsitution.methodinput;

import java.util.HashMap;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-10
 * @time 13:49
 */
public class Base {

    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
