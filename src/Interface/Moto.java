package Interface;

public class Moto implements Vehicule{
    @Override
    public void wheels() {
        System.out.println(2);
    }

    @Override
    public void meansOfTransport() {
        System.out.println("Ground");
    }
}
