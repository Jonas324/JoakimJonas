import java.util.ArrayList;

public class Owl {
    public boolean hungry;
    public static int wingSpan;
    public static int owlAge;

    public Owl(int wingSpan, boolean hungry, int owlAge) {
        super();

        setwingSpan(wingSpan);
        sethungry(hungry);
        setowlAge(owlAge);
    }

    private void setowlAge(int owlAge) {
        this.owlAge = owlAge;

    }

    private void sethungry(boolean hungry) {
        this.hungry = hungry;
    }

    private void setwingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String eat(ArrayList<Squirrel> squirrels) {

        int i = (int)(Math.random()*100) + 1 + wingSpan + owlAge;

        if (i >= 50 && squirrels.size() > 0){
            return "Uggglan äter";
        }
        else {
            return "Ugglan äter inte";
        }
    }
}
