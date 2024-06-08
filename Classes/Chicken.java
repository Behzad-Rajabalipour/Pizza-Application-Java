package Package18.Classes;

public class Chicken extends Meat{
    public final int weight;

    public Chicken(int weight) {
        this.weight = weight;
    }
    @Override
    protected int getCost() {return this.weight*100;}
}
