package services;

import model.Product;
import model.Store;

import java.util.List;

public interface StoreService {
    Store createStore(String storeName, List<Product> productList);
}
