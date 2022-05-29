package Interface;

public class Voiture implements Vehicule{
    @Override
    public void wheels() {
        System.out.println(4);
    }

    @Override
    public void meansOfTransport() {
        System.out.println("Ground");
    }
}
