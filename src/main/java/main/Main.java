package main;

import enums.Qualification;
import enums.Role;
import exception.CustomException;
import model.*;
import services.CashierService;
import services.impl.*;

import java.util.*;

public class Main extends Thread {
    public static void main(String[] args) throws CustomException {





        Applicant applicant1 = new Applicant(Qualification.MSC,Role.CASHIER);
        Applicant applicant2 = new Applicant(Qualification.HND,Role.CASHIER);
        Store store = new Store("SONS");
        //ManagerService steve = new Staff("stan","0802345765","nonso@gmail.com","0123543", Role.MANAGER);

        //steve.addToProductList(store);
 //       customer.addToCart(store,"gowns",2);
//        System.out.println(store.getProductList());
//        System.out.println(customer.getCart());

        ProductServiceImp productService = new ProductServiceImp();
        List<Product> productList = productService.getProductList();
        System.out.println(productList);
        StoreServiceImpl storeService = new StoreServiceImpl();
        Store newStore = storeService.createStore("", productList);
        ManagerImp manager = new ManagerImp();
        manager.hireCashier(applicant1);
        Cashier cashier = manager.hireSalesCashier(applicant1);
        CustomerServiceImp customerService1 = new CustomerServiceImp();


        Customer customer12 = new Customer("james","0809876357","no@gmail55.com",100050 );
        Customer customer22 = new Customer("john","08098745675","no@gmail5.com",100003 );
        Customer customer24 = new Customer("philip","0809873367","no@gmail35.com",100500 );
        Customer customer28 = new Customer("nathan","08098767353","no@gmail353.com",100500 );

        Cart cart = customerService1.buy(customer12,newStore,"polo",2,10000050);
        Cart cart2 = customerService1.buy(customer22,newStore,"polo",2,1000003);
        Cart cart3 = customerService1.buy(customer24,newStore,"polo",3,1000500);
        Cart cart4 = customerService1.buy(customer28,newStore,"polo",5,1000500);

        PriorityQueue<Cart> priorityQueue = new PriorityQueue<Cart>(new CartComparator());
        Queue<Cart> queue = new ArrayDeque<>();
        priorityQueue.add(cart);
        queue.add(cart);
        priorityQueue.add(cart2);
        queue.add(cart2);
        priorityQueue.add(cart3);
        queue.add(cart3);
        priorityQueue.add(cart4);
        queue.add(cart4);
        CashierServiceImp cashierServiceImp = new CashierServiceImp();
        //cashierServiceImp.sellPriorityQueue(cashier, priorityQueue);
        System.out.println("");
        cashierServiceImp.sellOrderly(cashier, queue);


    }


}