package services.impl;

import model.Cart;
import model.Cashier;
import services.CashierService;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CashierServiceImp implements CashierService, Runnable{

    @Override
    public void run() {

    }


    @Override
    public String sell(Cashier cashier, Cart cart) {
        dispenseReceipt(cart);
        return "Thank you for your " + cart.getId() + ". " + "Receipt dispensed by " + cashier.getStaff().getName();
    }

    @Override
    public Integer sellPriorityQueue(Cashier cashier, PriorityQueue<Cart> carts) {
        return sellOrderly(cashier, carts);
    }

    @Override
    public Integer sellOrderly(Cashier cashier, Queue<Cart> carts) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        int count = 0;
        while (!carts.isEmpty()) {
            Cart cart = carts.poll();
            executorService.execute(() -> {
                try{
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//            dispenseReceipt(cart);

                System.out.println(cart);;
            });
           ++count;
        }
        executorService.shutdown();
        return count;
    }

    @Override
    public void dispenseReceipt(Cart cart) {
        double totalPrice = 0;
        System.out.println("\n\t\t ***** RECEIPT ***** \n");
        System.out.println("Name:   " + cart.getId());
        System.out.println("Contact:   " + cart);
        System.out.println("\n          Products Purchased                         \n");
        System.out.println(1 + "." + "  " + cart.getProductName()+ " "
                + "       " + cart.getQuantity() + "        "+ cart.getTotalAmount());
        System.out.println("\n---------------------------------------");
        System.out.println("Total \t\t\t\t\t\t \t # " +  cart.getTotalAmount()*cart.getQuantity());
        System.out.println("---------------------------------------");
    }



}

//    public void dispenseReceipt(Customer customer) {
//        double totalPrice = 0;
//        System.out.println("\n\t\t ***** RECEIPT ***** \n");
//        System.out.println("Name:   " + customer.getName());
//        System.out.println("Contact:   " + customer.getPhoneNumber());
//        System.out.println("\n          Products Purchased                         \n");
//        for (int i = 0; i < customer.getCart().size(); i++) {
//            Product product = customer.getCart().get(i);
//            totalPrice += product.getPrice() * product.getQuantity();
//            System.out.println(i + 1 + "." + "  " + product.getName() + " ".repeat(15 - product.getName().length())
//                    + "       " + product.getQuantity() + "        "+ product.getPrice());
//        }
//        System.out.println("\n---------------------------------------");
//        System.out.println("Total \t\t\t\t\t\t \t # " + totalPrice);
//        System.out.println("---------------------------------------");
//    }
