package javaoop_1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> products;
    public BottleOfWaterVendingMachine(List<Product> products){
        this.products=products;
    }
    public Product getProduct(String name){
        for( Product product:products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }

    @Override
    public boolean addProduct(List<Product> productList) {
        if(products==null && productList==null){
            return false;
        }
        for (Product item:productList) {
            products.add(item);
        }
        return true;
    }
}
