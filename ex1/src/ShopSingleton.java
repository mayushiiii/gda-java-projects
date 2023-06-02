import java.util.*;
abstract class Product {
    public float price;
    public String name;
    public Product(float price, String name) {
        this.price = price;
        this.name = name;
    }
    abstract public float getPriceReduced();
    public String toString() {
        return "Nume: " + name + "\tPret: " + price;
    }
}
class Book extends Product {
    public Book(float price, String name) {
        super(price, name);
    }
    @Override
    public float getPriceReduced() {
        return (float) (price - 0.15 * price);
    }
}
class Food extends Product {
    public Food(float price, String name) {
        super(price, name);
    }
    @Override
    public float getPriceReduced() {
        return (float) (price - 0.2 * price);
    }
}
class Beverage extends Product {
    public Beverage(float price, String name) {
        super(price, name);
    }
    @Override
    public float getPriceReduced() {
        return (float) (price - 0.05 * price);
    }
}
class Computer extends Product {
    public Computer(float price, String name) {
        super(price, name);
    }
    @Override
    public float getPriceReduced() {
        return (float) (price - 0.1 * price);
    }
}
public class ShopSingleton {
    private static ShopSingleton instance = null;
    private String name;
    private ArrayList<Product> products;
    private ShopSingleton() {
        name = "Magazinul Singleton";
        products = new ArrayList<Product>();
    }
    public static ShopSingleton getInstance() {
        if (instance == null) {
            instance = new ShopSingleton();
        }
        return instance;
    }
    public void showProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public void removeProduct(Product p) {
        products.remove(p);
    }
    public Product getCheapestProduct() {
        float min_price = products.get(0).price;
        Product cheapest = products.get(0);
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).price < min_price) {
                min_price = products.get(i).price;
                cheapest = products.get(i);
            }
        }
        return cheapest;
    }

    @Override
    public String toString() {
        return "Magazinul: " + name + "\nProduse: \n" + products;
    }
}
class ProductFactory {
    public static Product factory(String type, String nameProduct, float productPrice) {
        if(type.equals("Book"))
            return new Book(productPrice, nameProduct);
        if(type.equals("Food"))
            return new Food(productPrice, nameProduct);
        if(type.equals("Beverage"))
            return new Beverage(productPrice, nameProduct);
        if(type.equals("Computer"))
            return new Computer(productPrice, nameProduct);
        throw new IllegalArgumentException("Type " + type + " is unrecognized");
    }
}
class TestShop {
    public static void main(String[] args) {
        Product book = ProductFactory.factory("Book", "Harry Potter", 50);
        Product food = ProductFactory.factory("Food", "Salata de vinete", 10);
        Product beverage = ProductFactory.factory("Beverage", "Coca Cola", 5);
        Product computer = ProductFactory.factory("Computer", "Laptop", 4500);
        ShopSingleton shop = ShopSingleton.getInstance();
        shop.addProduct(book);
        shop.addProduct(food);
        shop.addProduct(beverage);
        shop.addProduct(computer);
        shop.showProducts();
        System.out.println("Pret redus la " + book.name + " este " + book.getPriceReduced());
        System.out.println("Pret redus la " + food.name + " este " + food.getPriceReduced());
        System.out.println("Pret redus la " + beverage.name + " este " + beverage.getPriceReduced());
        System.out.println("Pret redus la " + computer.name + " este " + computer.getPriceReduced());
    }
}