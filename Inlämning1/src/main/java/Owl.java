import java.util.Random;

public class Owl {
    public boolean fed;
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

    public boolean getFed() {

        int i = (int)(Math.random()*100) + 1 + wingSpan + owlAge;

        if (i >= 50){
            return true;
        }
        else {
            return false;
        }
    }
}
