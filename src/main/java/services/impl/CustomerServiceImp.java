package services.impl;

import exception.CustomException;
import model.Cart;
import model.Customer;
import model.Product;
import model.Store;
import services.CustomerService;


import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImp implements CustomerService {

    @Override
    public Cart buy(Customer customer, Store store, String productName, int quantity, double wallet) throws CustomException {
        Product product = null;
        List<Product> productList = store.getProductList();
        for(Product p : productList){
            if(p.getName().equalsIgnoreCase(productName)){
                product = p;
            }
        }

        if (product == null)
            throw new CustomException("product not available");

        double totalPrice = product.getPrice() * quantity;
        if (totalPrice > wallet)
            throw new CustomException("insufficient fund");

        if(product.getQuantity() == 0)
            throw new CustomException("Out of stock");

        customer.setWallet(wallet - totalPrice);
        product.setQuantity(product.getQuantity() - quantity);

        Cart cart = new Cart(customer.getName(), product.getName(),quantity, totalPrice);
        cart.setContact(customer.getPhoneNumber());



        return cart;
    }


}
