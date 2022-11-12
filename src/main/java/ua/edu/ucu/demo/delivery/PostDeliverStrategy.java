package ua.edu.ucu.demo.delivery;

import ua.edu.ucu.demo.flowers.Item;

import java.util.List;

public class PostDeliverStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering via Post");
        items.stream().forEach(System.out::println);
    }
}
