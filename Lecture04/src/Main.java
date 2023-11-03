import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat();
        firstCat.lookCute();
        firstCat.pet();
        System.out.println(firstCat.name());
        System.out.println(firstCat.sound());

        Animal secondCat = new Cat();
        System.out.println(secondCat.name());
        System.out.println(secondCat.sound());

        Pet moreCat = new Cat();
        moreCat.pet();
        moreCat.lookCute();
    }
}