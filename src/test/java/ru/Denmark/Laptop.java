package ru.Denmark;

public class Laptop {
    String name;
    int model;
    int quantity;

    void printDiscription (){
        System.out.println( "ноутбук" +name+","+"серия"+model+","+"количество"+quantity);
    }


    public static void main(String[] args) {
        Laptop laptop = new Laptop ();
        laptop.model = 65444;
        laptop.name = "Lenova";
        laptop.quantity = 10+2;
        laptop.printDiscription();

        //System.out.println("ноутбук" + laptop.name +","+"серия" + laptop.model);
    }
}
