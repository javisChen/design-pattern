package com.iron.design.principle.liskovsubsitution;

import java.util.HashMap;
import java.util.Map;

public class LSP {


     static class A {
         public void fun(Map map){
            System.out.println("父类被执行...");
        }
    }
     
     static class B extends A{
         public void fun(HashMap map) {
            System.out.println("子类被执行...");
        }

     }
     
     public static void main(String[] args){
            System.out.print("父类的运行结果：");
            LSP lsp =new LSP();
            LSP.A a= new A();
            HashMap<Object, Object> map=new HashMap<Object, Object>();
            a.fun(map);
            //父类存在的地方，可以用子类替代
            //子类B替代父类A
            System.out.print("子类替代父类后的运行结果：");
            LSP.B b= new B();
            b.fun(map);
        }

}