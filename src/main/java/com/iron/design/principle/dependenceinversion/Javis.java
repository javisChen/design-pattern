package com.iron.design.principle.dependenceinversion;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 10:16
 */
public class Javis {

    private ICourse iCourse;

    public Javis(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
