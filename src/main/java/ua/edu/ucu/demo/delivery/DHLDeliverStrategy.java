package ua.edu.ucu.demo.delivery;

import ua.edu.ucu.demo.flowers.Item;

import java.util.List;

public class DHLDeliverStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Don't forget to receive your DHL delivery");
        System.out.println("Content of the package:");
        items.stream().forEach(System.out::println);
    }
}
