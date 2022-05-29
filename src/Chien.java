public class Chien extends Animal {
    public Chien(String nom, int id) {
        super(nom, id);
    }

    @Override
    public void talk() {
        System.out.println("Woaf");
    }

    public void catchBall() {
        System.out.println("Ball catched !");
    }
}
