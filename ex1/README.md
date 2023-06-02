<h1>README</h1>

This code implements a **shop application** that demonstrates the **Singleton and Factory design patterns**.

Design Patterns Used:

* *Singleton Design Pattern:*
    The ShopSingleton class implements the Singleton pattern, ensuring only one instance of the class is created. It provides a global point of access to that instance through the static method getInstance().

* *Factory Design Pattern:*
    The ProductFactory class implements the Factory pattern, creating different types of Product objects based on input. The static factory method factory() encapsulates the object creation logic.

<h2>Product Hierarchy</h2>

The code defines an *abstract class* Product with price and name attributes. It declares an abstract method getPriceReduced() to calculate the reduced price.

Concrete product classes:

* Book: Represents a book product.
* Food: Represents a food product.
* Beverage: Represents a beverage product.
* Computer: Represents a computer product.

Each concrete product class implements getPriceReduced().

<h2>ShopSingleton Class</h2>

The ShopSingleton class represents a shop and is designed as a **Singleton**. It provides methods to show products, add/remove products, and find the cheapest product.
TestShop Class

The TestShop class demonstrates the usage of the shop and products:

1. Creates different products using the ProductFactory class.
2. Gets the shop's singleton instance using ShopSingleton.getInstance().
3. Adds products to the shop.
4. Displays the products in the shop.
5. Prints the reduced prices of the products.
