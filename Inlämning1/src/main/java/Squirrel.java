public class Squirrel {

    private int weight;
    private int numOfConesInNest;
    private int age;

    public Squirrel(int weight, int numOfConesInNest, int  age){

        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;


    }


    public void setWeight(int i){weight = i; }

    public int getNumOfConesInNest(){ return numOfConesInNest;}
    public void setNumOfConesInNest(int i){numOfConesInNest = i; }
    public void setAge(int i){age = i; }
    public int getWeightAge(){ return weight + age;}


}
