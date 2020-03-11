package com.iron.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-10
 * @time 11:36
 */
public class Teamleader {

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
