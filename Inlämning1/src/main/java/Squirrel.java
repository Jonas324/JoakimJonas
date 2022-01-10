public class Squirrel {

    private int weight;
    private int numOfConesInNest;
    private int age;

    public Squirrel(int weight, int numOfConesInNest, int  age){
        super();

        setweight(weight);
        setnumOfConesInNest(numOfConesInNest);
        setage(age);
    }

    private void setage(int age) {
        this.age = age;
    }

    private void setnumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    private void setweight(int weight) {
        this.weight = weight;
    }


    public String getWeightAge(){
        String squirrel = "Vikt: " + weight + "| Antal kottar: " + numOfConesInNest + " | Ålder: " + age + "\n";
        return squirrel;
    }
}
