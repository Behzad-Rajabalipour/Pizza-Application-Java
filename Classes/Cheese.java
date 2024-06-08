package Package18.Classes;

public class Cheese extends PizzaContent{
    private final int weight;
    public Cheese(int weight) {
        this.weight = weight;
    }
    @Override
    protected int getCost() {
        return this.weight*87000;
    }
}
