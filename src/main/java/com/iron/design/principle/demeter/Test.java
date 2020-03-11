package com.iron.design.principle.demeter;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-10
 * @time 11:38
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Teamleader teamleader = new Teamleader();
        boss.commandCheckNumber(teamleader);
    }
}
