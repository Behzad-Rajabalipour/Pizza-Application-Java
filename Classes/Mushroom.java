package Package18.Classes;

public class Mushroom extends Vegetable{
    private int weight;
    private boolean canned;

    public Mushroom(int weight, boolean canned) {
        this.weight = weight;
        this.canned = canned;
    }

    @Override
    protected int getCost() {
        int cost = weight*30000;
        if(!canned)
            cost*=2;
        return cost;
    }
}
