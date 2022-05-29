package Polymorphism;

public class Vache extends Animal {
    @Override
    public void shout() {
        System.out.println("Meuh");
    }

    public void makeMilk() {
        System.out.println("1L of Milk produced");
    }
}
