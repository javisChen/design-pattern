package com.iron.design.principle.singleresponsibility;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-09
 * @time 11:28
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
//        address = "beijing";
    }

    private void updateUsername(String address) {
//        userName = "geely";
//        address = "beijing";
    }
}
