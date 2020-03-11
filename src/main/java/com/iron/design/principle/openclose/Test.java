package com.iron.design.principle.openclose;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-03
 * @time 16:03
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        String format = String.format("课程ID%s: 课程名称%s 课程价格%s 课程原价%s",
                javaDiscountCourse.getId(), javaDiscountCourse.getName(), javaDiscountCourse.getPrice(), javaDiscountCourse.getOriginPrice());
        System.out.println(format);
    }
}
