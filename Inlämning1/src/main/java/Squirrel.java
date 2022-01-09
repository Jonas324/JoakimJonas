public class Squirrel {

    private int weight;
    private int numOfConesInNest;
    private int age;

    public Squirrel(int weight, int numOfConesInNest, int  age){

        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;


    }

    public int getWeightAge(){ return weight + age;}
    public void setWeight(int i){weight = i; }

    public int getNumOfConesInNest(){ return numOfConesInNest;}
    public void setNumOfConesInNest(int i){numOfConesInNest = i; }

    public int getAge(){ return age;}
    public void setAge(int i){age = i; }



}
