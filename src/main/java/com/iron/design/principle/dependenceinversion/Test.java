package com.iron.design.principle.dependenceinversion;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 10:17
 */
public class Test {

//    public static void main(String[] args) {
//        Javis javis = new Javis();
//        javis.studyJavaCourse();
//        javis.studyPythonCourse();
//    }

//    public static void main(String[] args) {
//        Javis javis = new Javis();
//        javis.studyCourse(new JavaCourse());
//        javis.studyCourse(new PythonCourse());
//    }

    public static void main(String[] args) {
        Javis javis = new Javis(new JavaCourse());
        javis.studyCourse();

        javis.setiCourse(new PythonCourse());
        javis.studyCourse();

    }
}
