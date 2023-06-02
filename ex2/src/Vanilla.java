public class Vanilla extends ToppingDecorator{
    Vanilla(IceCream tempIceCream) {
        super(tempIceCream);
        System.out.println("Adding vanilla");
    }

    public String getDescription(){
        return super.getDescription() + "vanilla topping ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }
}
