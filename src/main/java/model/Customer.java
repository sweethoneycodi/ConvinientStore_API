package model;

import exception.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private double wallet;
    private double totalAmount;
    private List<Product> cart = new ArrayList<>();

    public Customer(String name, String phoneNumber, String email, double wallet) {
        super(name, phoneNumber, email);
        this.wallet = wallet;
    }

    public Customer(String name, String phoneNumber, String email, double wallet, List<Product> cart) {
        super(name, phoneNumber, email);
        this.wallet = wallet;
        this.cart = cart;
    }

//    public void addToCart(Store store, String productName, int quantity) throws CustomException {
//        Product product = new Product();
//        List<Product> productList = store.getProductList();
//        for(Product p : productList){
//            if(p.getName().equalsIgnoreCase(productName)){
//                product = p;
//            }
//        }
//
//
//        double totalPrice = product.getPrice() * quantity;
//        if(wallet >= totalPrice){
//            if(product.getQuantity() >= quantity){
//                cart.add(new Product(product.getName(), product.getCategory(), quantity,product.getPrice()));
//                product.setQuantity(product.getQuantity() - quantity);
//                wallet -= totalPrice;
//            }else{
//                if(product.getQuantity() == 0){
//                    System.out.println("Out of stock");
//                }
//                else
//                    System.out.println("We have only " + product.getQuantity() +" "+ product.getName() + " available");
//            }
//        }else {
//            System.out.println("insufficient Funds");
//            throw new CustomException("insufficient Funds");
//        }
//
//    }


//    public String addToCart(Product product, int quantity) {
//        double price = product.getPrice() * quantity;
//        if (wallet >= price) {
//
//            if (product.getQuantity() >= quantity) {
//                cart.add(new Product(product.getName(), product.getCategory(), quantity, product.getPrice()));
//                product.setQuantity(product.getQuantity() - quantity);
//                wallet -= price;
//            } else if (product.getQuantity() == 0) {
//                throw new RuntimeException("out of stock");
//            }
//
//        }
//    }


    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "wallet=" + wallet +
                ", cart=" + cart +
                '}';
    }
}
