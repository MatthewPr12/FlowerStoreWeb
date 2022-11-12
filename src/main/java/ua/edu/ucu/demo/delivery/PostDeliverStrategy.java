package ua.edu.ucu.demo.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ua.edu.ucu.demo.flowers.Item;

import java.util.List;

@JsonDeserialize(as = PostDeliverStrategy.class)
public class PostDeliverStrategy implements Delivery {
    @JsonProperty(value = "deliveryType")
    String deliveryType;
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering via Post");
        items.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "PostDeliverStrategy{" +
                '}';
    }
}
