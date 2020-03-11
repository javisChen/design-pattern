//package com.iron.design.principle.liskovsubsitution;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class LSP1 {
//    abstract class A {
//        public abstract HashMap fun();
//    }
//
//    class B extends A {
//        @Override
//        public Map fun() {
//            HashMap b = new HashMap();
//            b.put("b", "子类被执行...");
//            return b;
//        }
//    }
//
//    public static void main(String[] args) {
//        LSP1 lsp = new LSP1();
//        LSP1.A a = lsp.new B();
//        System.out.println(a.fun());
//    }
//
//}