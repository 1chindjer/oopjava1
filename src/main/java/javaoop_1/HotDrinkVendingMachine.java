package javaoop_1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
        private List<Product> products;
        public HotDrinkVendingMachine (List<Product> products){
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

        public Product getProduct(String name, Double volume, int temperature) {
            for (Product product : products) {
                if (product instanceof HotDrink) {
                    HotDrink hotDrink = (HotDrink) product;
                    if (hotDrink.getName().equalsIgnoreCase(name) &&
                            hotDrink.getVolume().equals(volume) &&
                            hotDrink.getTemperature() == temperature) {
                            return hotDrink;
                    }
                }
            }
            throw new IllegalStateException(String.format("Горячий напиток с названием %s, объема %.2f, и температурой %d не обнаружен.", name, volume, temperature));

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

