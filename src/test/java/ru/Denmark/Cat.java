package ru.Denmark;


public class Cat {
    String name;
    String breed;
    String title;
    int quantityScotland;
    int quantityBritish;

    void printOnDisplay (){
        //System.out.println("кот"+name+"порода"+breed+"титул"+title);
        System.out.println("Cats");
        System.out.println("Cat-" + name);
        System.out.println("Breed-" + breed);
        System.out.println("Title-" + title);
    }

    public void eat(){
        System.out.println("My cat " + name + " is "+"eating something");
    }

    public void countCats(){
        System.out.println(quantityBritish+quantityBritish);
    }


}
