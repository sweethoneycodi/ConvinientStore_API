package services.impl;

import services.ProductService;
import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements ProductService {
    @Override
    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();


        String path = "src/main/resources/PRODUCT.csv";
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null){
                String[] value = line.split(",");
                Product product = new Product(value[0],value[1],Integer.parseInt(value[2]),Double.parseDouble(value[3]));
                productList.add(product);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return productList;
    }


}
