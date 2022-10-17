package model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private Staff staffs;
    private List<Product> productList = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public Store(String name, Staff staffs, List<Product> productList) {
        this.name = name;
        this.staffs = staffs;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff staffs) {
        this.staffs = staffs;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
