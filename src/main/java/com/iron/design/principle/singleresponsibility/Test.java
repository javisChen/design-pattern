package com.iron.design.principle.singleresponsibility;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 11:07
 */
public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}