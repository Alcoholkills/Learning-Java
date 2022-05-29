package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        L'idee est d'avoir 2 attributs qui pour des raisons metier doivent :
//        - un etre en read only
//        - l'autre en write only
//        Voyont comment l'encapsulation permet d'imposer ca
        EncapsulationTrue encapT = new EncapsulationTrue();
        encapT.getAttribut_read_only();
        encapT.setAttribut2_write_only(43);
//        Je ne peux rien faire d'autre sur EncapsulationTrue
//        Vu que le developpeur ne me donne pas plus de Getter et Setter,
//        Je ne peux rien faire d'autre que ce qui est prevu par le code
//        Contrairement ...

        EncapsulationFalse encapF = new EncapsulationFalse();
        encapF.attribut_read_only = 1234567890;
        System.out.println(encapF.attribut2_write_only);
//        Ici, vu que les attributs ne sont pas proteges,
//        Je suis libre de faire ce que je veux.
//        Ceci constitue donc une vulnerabilite dans mon application.

//        Il est vrai que je peux rajouter des Getter et Setter dans EncapsulationTrue
//        pour modifier attribut_read_only et affichier attribut_write_only
//        Cependant, c'est bien le developpeur de la classe EncapsulationTrue qui decide ;
//        Pas une autre classe.
    }
}
