public class Chat extends Animal {

    public Chat(String nom, int id) {
        super(nom, id);
    }

    @Override
    public void talk() {
        System.out.println("Miaou");
    }

    public void lick() {
        System.out.println("Now I'm clean !");
    }

    public static void main(String args[]) {
        System.out.println("This is Chat.java");
//        Animal chat = new Chat("Chausette", 321);
        Chat chat = new Chat("Chausette", 321);
        chat.show();
        chat.talk();
        chat.lick();
    }
}
