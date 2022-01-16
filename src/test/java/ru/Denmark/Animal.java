package ru.Denmark;

public class Animal {
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.title = "World Premior";
        cat.breed = "British";
        cat.name = "Oliver";
        cat.printOnDisplay();
        Dog dog =new Dog();
        dog.title="World Premior";
        dog.breed="Poodle";
        dog.name="Richard";
        dog.printOnDisplay();

        if (cat.title == "World Premior1"){
            cat.printOnDisplay();
        } else{
            System.out.println("Error");
        }

    }
}
