public class PineTree {
    private boolean snow;
    private int age;
    private int wind;

    public PineTree(int wind, int age, boolean snow) {
        super();
        
        setwind(wind);
        setage(age);
        setsnow(snow);
    }

    private void setsnow(boolean snow) {
        this.snow = snow;
    }

    private void setage(int age) {
        this.age = age;
    }

    private void setwind(int wind) {
        this.wind = wind;
    }

    public String getFall() {

        int fall = 0;

        if (snow = true) {
            fall = 40 + age + wind;
        }else {
            fall = age + wind;
        }

        if (fall >= 50){
            return "Trädet har fallit";
        }
        else {
            return "Trädet står kvar";
        }
    }
}
