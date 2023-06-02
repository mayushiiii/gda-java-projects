public class BasicIceCream implements IceCream{

    BasicIceCream() {
        System.out.println("Adding cone");
    }
    @Override
    public String getDescription() {
        return "cone ";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}
