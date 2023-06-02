public class Main {
    public static void main(String[] args) {
        IceCream iceCream1 = new Chocolate(new Vanilla(new BasicIceCream()));
        System.out.println(iceCream1.getCost() + " " + iceCream1.getDescription());
    }
}