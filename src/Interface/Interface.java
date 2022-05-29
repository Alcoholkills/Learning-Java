package Interface;

public class Interface {
    public static void main(String[] args) {
        Bateau bateau = new Bateau();
        Moto moto = new Moto();
        Voiture voiture = new Voiture();

        bateau.wheels();
        bateau.meansOfTransport();

        moto.wheels();
        moto.meansOfTransport();

        voiture.wheels();
        voiture.meansOfTransport();

//        bateau.motor;
//        Une interface ne peux pas creer de variable.
//        La ligne ci-dessus est donc invalide.
//        Du point de vue de bateau, l'interface Vehicule n'a pas d'attribut motor.

//        Vehicule vehicule = new Vehicule();
//        Une interface ne peux pas etre instanciee :
//        Il faut voir une interface comme un plan de construction,
//        qui va ensuite etre utilise par d'autres classes.
    }
}
