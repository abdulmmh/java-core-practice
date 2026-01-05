/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Abstract;

/**
 *
 * @author Awerty
 */
public class Test extends B implements A  {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.v();
        obj.v1();
        obj.v2();
    }

    @Override
    public void v() {
        System.out.println("I am a method from interface");
    }   
}
interface A{
     
   void v();
}

 
abstract class C {
    abstract void v1();
}
class B extends C {
    
    void v2(){
        System.out.println("I am a method from non-abstract class");
    }

    @Override
    void v1() {
        System.out.println("I am a method from abstract class");
    }
}