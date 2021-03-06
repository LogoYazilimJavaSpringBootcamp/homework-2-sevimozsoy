package org.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.week1.CustomerOperations.customer;
import static org.week1.CustomerOperations.customerList;

public class OrderOperations implements OperationI {
    static List<Order> orderList = new ArrayList<>();


    @Override
    public void setInitialize() {
        orderList.add(new Order(1, 1200));
        orderList.add(new Order(2, 1600));
        orderList.add(new Order(3, 1700));
    }

    public void createNewOrder(Order order, String customerName) {
        if (customerList.contains(customerName)) {
            customer.setName(customerName);
            customer.getOrderList().add(order);
        }
        orderList.add(order);
    }

    public Map<Integer, Integer> listExpensiveOrders() {
        return orderList.stream().filter(order -> order.getOrderTotalPrice() > 1500).collect(Collectors.toMap(Order::getOrderId, Order::getOrderTotalPrice));
    }

    public void averageExpensiveOrders() {
        Map<Integer, Integer> average = listExpensiveOrders();
        int sum = average.values().stream().reduce(0, Integer::sum);
        System.out.println(sum / average.size());
    }

    @Override
    public void getAll() {
        orderList.stream().map(Order::getOrderId).forEach(System.out::println);
    }


}
