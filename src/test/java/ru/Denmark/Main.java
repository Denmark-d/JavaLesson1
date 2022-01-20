package ru.Denmark;

public class Main {
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.title = "World Premior";
        cat.breed = "British";
        cat.breed = "Scotland";
        cat.name = "Oliver";
        cat.quantityScotland = 10;
        cat.quantityBritish = 20;
        cat.countCats();
        Dog dog =new Dog();
        dog.title="World Premior";
        dog.breed="Poodle";
        dog.name="Richard";
        dog.quantity2 = 15;
        cat.eat();
    }

}
