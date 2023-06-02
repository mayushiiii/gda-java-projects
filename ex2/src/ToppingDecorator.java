public abstract class ToppingDecorator implements IceCream{
    private IceCream tempIceCream;

    ToppingDecorator(IceCream tempIceCream){

        this.tempIceCream = tempIceCream;
    }

    public String getDescription() {
        return tempIceCream.getDescription();
    }
    public double getCost() {
        return tempIceCream.getCost();
    }
}
