import java.net.StandardSocketOptions;

public class App {

    public static void main(String[] args) {

        int age = 10;
        int numOfConesInNest = 20;
        int weight = 30;

        boolean hungry = true;
        int wingSpan = 20;
        int owlAge = 15;

        Squirrel sqr = new Squirrel(age, numOfConesInNest, weight);

        System.out.println(sqr.getWeightAge());

        Owl owl = new Owl(wingSpan, hungry, owlAge);

        System.out.println(owl.getFed());
    }
}

