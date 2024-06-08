package Package18;

import Package18.Classes.*;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(DeliveryType.MotorCycle);
        order1.addItemOrder(new Drink("coca",500,true));

        Pizza pizza1 = new Pizza("GharchoMorgh",PizzaSize.Large);
        pizza1.addContentToPizza(new Cheese(50));
        pizza1.addContentToPizza(new Tomato(100));
        pizza1.addContentToPizza(new Mushroom(80,false));
        pizza1.addContentToPizza(new Chicken(150));

        Pizza pizza2 = new Pizza("Peperoni",PizzaSize.Mini);
        pizza2.addContentToPizza(new Chicken(200));
        pizza2.addContentToPizza(new Tomato(150));

        order1.addItemOrder(pizza1);
        order1.addItemOrder(pizza2);

        System.out.println("Your Order cost is: " + order1.calcOrderCost() + " Toman");
    }
}
