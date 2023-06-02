Design Pattern Used

Decorator Design Pattern:
The code uses the Decorator pattern to add toppings to a basic ice cream object. The IceCream interface represents the base component, and the ToppingDecorator class is the abstract decorator class. The concrete decorators, Chocolate and Vanilla, extend the ToppingDecorator class and add specific toppings to the ice cream.
Ice Cream Classes

    Main: The main method creates an instance of IceCream with multiple decorators and prints the cost and description of the ice cream.

    IceCream interface: Defines the methods getDescription() and getCost(), which are implemented by the concrete classes.

    BasicIceCream: Represents the basic ice cream. It implements the IceCream interface and provides the base functionality.

    ToppingDecorator abstract class: Implements the IceCream interface and has a reference to an IceCream object. It provides default implementations for the methods and delegates the calls to the wrapped object.

    Chocolate and Vanilla classes: Extend the ToppingDecorator class and add specific toppings to the ice cream. They override the getDescription() and getCost() methods to add the topping's description and cost to the base ice cream.