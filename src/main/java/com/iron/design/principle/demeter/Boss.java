package com.iron.design.principle.demeter;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-10
 * @time 11:34
 */
public class Boss {

    public void commandCheckNumber(Teamleader teamleader) {
        teamleader.checkNumberOfCourses();
    }
}
