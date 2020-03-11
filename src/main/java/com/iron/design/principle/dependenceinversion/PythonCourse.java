package com.iron.design.principle.dependenceinversion;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 10:20
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Java正在学习Python课程");
    }
}
