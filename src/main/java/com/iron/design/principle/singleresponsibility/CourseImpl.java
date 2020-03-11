package com.iron.design.principle.singleresponsibility;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 11:26
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
