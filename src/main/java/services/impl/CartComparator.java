package services.impl;

import model.Cart;

import java.util.Comparator;

public class CartComparator implements Comparator<Cart> {

    @Override
    public int compare(Cart o1, Cart o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
