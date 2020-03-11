package com.iron.design.principle.dependenceinversion;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 10:19
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Javis正在学习Java课程");
    }
}
