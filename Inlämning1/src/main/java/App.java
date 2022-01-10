import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        ArrayList<Squirrel> squirrels = new ArrayList<>();

        int wind = 30;
        int age = 60;
        boolean snow = true;

        boolean hungry = true;
        int wingSpan = 20;
        int owlAge = 15;

        Squirrel sqr0 = new Squirrel(15, 10, 20);
        squirrels.add(sqr0);

        Squirrel sqr1 = new Squirrel(10, 5, 13);
        squirrels.add(sqr1);

        Squirrel sqr2 = new Squirrel(13, 0, 2);
        squirrels.add(sqr2);

        for (Squirrel item : squirrels){
            System.out.println(item.eat());
        }

        Owl owl = new Owl(wingSpan, hungry, owlAge);
        System.out.println(owl.eat(squirrels));

        PineTree pine = new PineTree(wind, age, snow);
        System.out.println(pine.getFall());
    }
}

