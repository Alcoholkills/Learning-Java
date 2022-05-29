package Inheritance;

public class Renault extends Voiture {

//    @Override
    public void tutut() {
        System.out.println("Renault: Tut tuuut !");
    }

    public static void main(String[] args) {
        Renault clio = new Renault();
        clio.honk();
//        Ici, clio ne voit pas honk() dans la classe Renault
//        Mais comme Renault est la classe fille de Voiture et que honk() est definie dans Voiture
//        Alors clio peut appeler honk() de Voiture.

        clio.tutut();
//        Ici, c'est bien le tutut de Renalt qui est utilise
//        Puisque la methode est override en runtime
//        Pour du code propre, il faudrait decommenter le @Override

        Voiture voiture = new Renault();
        voiture.tutut();
//        Meme chose ici ; c'est bien un objet Renault qui est utilise

    }
}
