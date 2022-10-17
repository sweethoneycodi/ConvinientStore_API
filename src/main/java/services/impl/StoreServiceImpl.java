package services.impl;

import model.Product;
import model.Store;
import services.StoreService;

import java.util.List;

public class StoreServiceImpl implements StoreService {
    @Override
    public Store createStore(String storeName, List<Product> productList) {
        Store store = new Store(storeName);
        store.setProductList(productList);
        return store;
    }
}
