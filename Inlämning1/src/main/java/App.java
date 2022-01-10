import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<String> squirrels = new ArrayList<>();

        int wind = 30;
        int age = 60;
        boolean snow = true;

        boolean hungry = true;
        int wingSpan = 20;
        int owlAge = 15;

        Squirrel sqr = new Squirrel(15, 10, 20);
        squirrels.add(sqr.getWeightAge());

        Squirrel sqr1 = new Squirrel(10, 5, 13);
        squirrels.add(sqr1.getWeightAge());

        Squirrel sqr2 = new Squirrel(13, 0, 2);
        squirrels.add(sqr2.getWeightAge());

        System.out.println("Ekorrar i trädet: " + squirrels);

        Owl owl = new Owl(wingSpan, hungry, owlAge);
        System.out.println(owl.getFed());

        PineTree pine = new PineTree(wind, age, snow);
        System.out.println(pine.getFall());
    }
}

