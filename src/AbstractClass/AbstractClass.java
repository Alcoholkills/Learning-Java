package AbstractClass;

public class AbstractClass {
    public static void main(String[] args) {
        Animal chien = new Chien();
        Animal chat = new Chat();

        chien.shout();
        chien.sleep();

        chat.shout();
        chat.sleep();

//        Il s'agit s'implement d'un heritage, a la difference pres que :
//        Une classe abstraite ne peux pas etre instanciee
//        Animal animal = new Animal();
//        Provoque une erreur
    }
}
