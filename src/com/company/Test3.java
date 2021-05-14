package com.company;

class Testing {
    String color = "white";
    void print(){
        System.out.printf("Color = %s", color);
    }
}
class Person extends Testing{
    String color = "black";
    void print(){
        System.out.printf("ColorPerson = %s ColorTest3 = %s", color, super.color);
    }
}
class Test3{
    public static void main(String args[]){
        Person p = new Person();
        p.print();
    }
}
