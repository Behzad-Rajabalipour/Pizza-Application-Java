package Package18.Classes;

public class ChickenHam extends Meat{
    private int weight;

    public ChickenHam(int weight) {
        this.weight = weight;
    }

    @Override
    protected int getCost() {
        return this.weight*100000;
    }
}
