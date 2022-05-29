package Polymorphism;

public class Animal {
    public void shout() {
        System.out.println("Animal shouts");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal chien = new Chien();
        Animal chat = new Chat();

        animal.shout();
        chien.shout();
        chat.shout();

//        Ca ressemble a de l'heritage, mais il y a une grande difference
//        shout() est REDEFINI dans chaque classe, pas utilise comme telle
//        Cette distinction la est la difference entre du polymorphisme et de l'heritage

//        Animal vache = new Vache();
        Vache vache = new Vache();
        vache.shout();
        vache.makeMilk();
//        En ecrivant la declaration de vache en commente,
//        Java va essayer de trouver une methode makeMilk() dans Animal,
//        qui devrait logiquement etre override par Vache.
//        Or, makeMilk est specifique a Vache !
//        Du coup on ne peut pas declarer vache comme etant un animal
    }
}
