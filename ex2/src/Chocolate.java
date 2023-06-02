public class Chocolate extends ToppingDecorator{
    Chocolate(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding choco");
    }

    public String getDescription(){
        return super.getDescription() + "chocolate topping ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
