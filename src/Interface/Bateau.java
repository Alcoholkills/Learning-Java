package Interface;

public class Bateau implements Vehicule{
    @Override
    public void wheels() {
        System.out.println(0);
    }

    @Override
    public void meansOfTransport() {
        System.out.println("Water");
    }
}
