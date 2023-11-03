public class Cat extends Animal implements Pet {
    @Override
    public String name() {
        return "Cat";
    }

    @Override
    public int weight() {
        return 1;
    }

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public void pet() {
        System.out.println("Purrrr!");
    }

    @Override
    public void lookCute() {
        System.out.println("So Kawaiiiiiiii!");
    }
}
