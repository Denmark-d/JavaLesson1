package ru.Denmark;

public class Employee {
    String name;
    int age;

    //public static void main(String[] args) {
       // Employee dept = new Employee();
       // dept.age = 33;
      //  dept.name = "Роман";

       //System.out.println("сотрудник " + dept.name + ", его возраст - " + dept.age);

    //}

    public Employee(String name, int age){
        this.name= name;
        this.age= age;

    }
    public static void main(String[] args) {
        Employee dept = new Employee("Федор",56);
        System.out.println("Создали струдника");
        System.out.println(dept.name);
        System.out.println(dept.age);
    }

    }

