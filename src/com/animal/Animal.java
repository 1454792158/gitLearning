package com.animal;

public class Animal {
    String name;
    int age;
    StringBuffer stringBuffer = new StringBuffer();
    public Animal(){

    }
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String run(){
        stringBuffer.append(this.age).append("岁的").append(this.name).append("is playing!!!!");
        return stringBuffer.toString();
    }
}
