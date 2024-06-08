package Package18.Classes;

import java.util.ArrayList;
import java.util.List;

public class Order {
    DeliveryType deliveryType;
    List<ItemOrder> itemOrderList = new ArrayList<>();

    public Order(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }
    public void addItemOrder(ItemOrder itemOrder){
        itemOrderList.add(itemOrder);
    }
    public int calcOrderCost(){
        int sum = deliveryType.value;
        for(ItemOrder item:itemOrderList){
            sum+=item.getCost();
        }
        if (sum>3000)
            sum-=0.1*sum;        // 10% takhfif
        return sum;
    }
}
