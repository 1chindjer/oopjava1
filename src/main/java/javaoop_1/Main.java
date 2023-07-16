package javaoop_1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotDrink coffee = new HotDrink("Кофе", 2.50, 0.33, 70);
        HotDrink tea = new HotDrink("Чай", 2.00, 0.50, 65);
        HotDrink hotChocolate = new HotDrink("Какао", 3.00, 0.30, 68);

        // Добавляем их в список продуктов
        List<Product> products = new ArrayList<>();
        products.add(coffee);
        products.add(tea);
        products.add(hotChocolate);

        // Создаем горячий напиток автомат с этими продуктами
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(products);

        // Получаем продукт по имени
        Product product = vendingMachine.getProduct("Кофе");
        System.out.println("Получен напиток: " + product);

        // Получаем продукт по имени, объему и температуре
        product = vendingMachine.getProduct("Чай", 0.50, 65);
        System.out.println("Получен напиток: " + product);
    }
}