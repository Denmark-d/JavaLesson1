package ru.Denmark;

public class Laptop {
    String name;
    int model;

    void discription (){
        System.out.println( "ноутбук" +name+","+"серия"+model);
    }


    public static void main(String[] args) {
        Laptop laptop = new Laptop ();
        laptop.model = 65444;
        laptop.name = "Lenova";
        laptop.discription();

        //System.out.println("ноутбук" + laptop.name +","+"серия" + laptop.model);
    }
}
