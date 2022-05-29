package MultipleMain;

public class MultipleMain {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        Three three = new Three();

        System.out.println(one.one);
        System.out.println(two.two);
        System.out.println(three.three);

//        Essaye de lancer le main des autres classes pour voir ;)
    }
}
