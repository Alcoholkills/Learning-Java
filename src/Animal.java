public class Animal {

    private int id;
    public String name;

    public Animal(String nom, int id) {
        this.name = nom;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("Animal: name: " + this.name + " | id: " + this.id);
    }

    public void talk() {
        System.out.println("Animal: Talking to the moon ...");
    }

    public static void main(String args[]) {
        System.out.println("ANIMAL");
        Animal animal = new Animal("Pierre", 21);
        animal.show();
        animal.talk();

        Animal chat = new Chat("Minou", 182);
        chat.show();
        chat.talk();

        Chat chat2 = new Chat("Miaous", 513);
        chat2.show();
        chat2.talk();
        chat2.lick();

        Animal chien = new Chien("Dingo", -31);
        chien.talk();
        chien.show();

        Chien chien2 = new Chien("Ryo", -56);
        chien2.talk();
        chien2.show();
        chien2.catchBall();

    }
}
