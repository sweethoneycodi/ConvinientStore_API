package services.impl;

import exception.CustomException;
import model.Customer;
import model.Product;
import model.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImpTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addToCart() throws CustomException {
        Store store = new Store("sons");
        List<Product> productList = store.getProductList();
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        Customer customer = new Customer("james","0903338848","james2@gmail.com",888885);
        customerServiceImp.buy(customer,store,"polo",2,234566);
    }

    @Test
    void toAddToCart(Customer customer, Store store, String productName, int quantity, double wallet) {

    }
}