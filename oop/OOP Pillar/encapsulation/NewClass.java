package com.encapsulation;


public class NewClass {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
   public void setName(String name){
       this.name = name;
   }
   
   public int getAge(){
       return age;
   }
   
   public void setAge(int age){
       this.age = age;
   }

    @Override
    public String toString() {
        return "NewClass{" + "name=" + name + ", age=" + age + '}';
    }
 
}

 class test{
    public static void main(String[] args) {
        NewClass s = new NewClass();
        s.setAge(67);
        System.out.println(s);
    }
}