package com.company;

class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}

class MainClass {
    public static void main(String[] args){
        A obj = new B();
        obj.show();

    }
}
