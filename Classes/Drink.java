package Package18.Classes;

public class Drink extends ItemOrder{
    private String drinkName;
    private int weight;
    private boolean carbonated;

    public Drink(String drinkName, int weight, boolean carbonated) {
        this.drinkName = drinkName;
        this.weight = weight;
        this.carbonated = carbonated;
    }

    @Override
    protected int getCost() {
        int cost = this.weight*20;
        if(this.carbonated){
            cost+=4000;
        }
        return cost;
    }
}
