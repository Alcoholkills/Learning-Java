package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Renault clio = new Renault();
        clio.honk();
//        Ici, clio ne voit pas honk() dans la classe Renault
//        Mais comme Renault est la classe fille de Voiture et que honk() est definie dans Voiture
//        Alors clio peut appeler honk() de Voiture.

    }
}
