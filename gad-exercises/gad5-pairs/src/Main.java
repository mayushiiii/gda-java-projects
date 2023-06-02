public class Main {
    public static void main(String[] args) throws Exception {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 43);
        Pair<Running> pairOK = new Pair<>(runningShoe1,runningShoe2);
        //System.out.println(pairOK.getFirst().getColor());
        Running runningShoe3 = new Running("RED", 41);
        Boot bootShoe = new Boot("BLK", 46);
        //Pair<Running> pairKO = new Pair<>(runningShoe1, bootShoe);
    }
}