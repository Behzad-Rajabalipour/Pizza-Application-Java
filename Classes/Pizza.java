package Package18.Classes;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ItemOrder{
    private int basePrice = 10000;
    private String pizzaName;
    private PizzaSize pizzaSize;        // object
    private List<PizzaContent> pizzaContentList;

    public Pizza(String pizzaName, PizzaSize pizzaSize) {
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaContentList = new ArrayList<PizzaContent>();
    }

    // input(pizzaContent) mitun hameye farzanhaye PizzaContent bashe mesle Tomato,Mushroom,Cheese
    public void addContentToPizza(PizzaContent pizzaContent){
        this.pizzaContentList.add(pizzaContent);
    }

    @Override
    protected int getCost() {
        int sum =0;
        sum+=basePrice;
        for(PizzaContent pizzaContent:pizzaContentList){
            sum+=pizzaContent.getCost();
        }
        return pizzaSize.value*sum;
    }
}
