package Package18.Classes;

import java.util.ArrayList;
import java.util.List;

public class Tomato extends Vegetable{
    private int weight;

    public Tomato(int weight) {
        this.weight = weight;
    }

    @Override
    protected int getCost() {
        return weight*45000;
    }

    public static class Order {
        DeliveryType deliveryType;
        List<ItemOrder> itemOrderList = new ArrayList<>();
        public Order(DeliveryType deliveryType) {
            this.deliveryType = deliveryType;
        }
        public int calcOrderCost(){
            int sum = deliveryType.value;
            for (ItemOrder item:itemOrderList){
                sum+=item.getCost();
            }
            if (sum>3000)
                sum-=0.1*sum;       // 10% takhfif
            return sum;
        }
    }
}
