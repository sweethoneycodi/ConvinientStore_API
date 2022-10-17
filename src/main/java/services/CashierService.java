package services;

import model.Cart;
import model.Cashier;


import java.util.PriorityQueue;
import java.util.Queue;

public interface CashierService {
    String sell(Cashier cashier, Cart cart);

    Integer sellPriorityQueue(Cashier cashier, PriorityQueue<Cart> carts);

    Integer sellOrderly(Cashier cashier, Queue<Cart> carts);


    void dispenseReceipt(Cart cart);
}
