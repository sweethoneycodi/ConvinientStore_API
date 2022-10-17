package services;

import exception.CustomException;
import model.Cart;
import model.Customer;
import model.Store;

public interface CustomerService {
    Cart buy(Customer customer, Store store, String productName, int quantity, double wallet) throws CustomException;
}
