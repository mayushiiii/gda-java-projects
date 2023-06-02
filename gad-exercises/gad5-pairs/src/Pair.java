public class Pair <T extends Shoe>{
    private T first;
    private T second;
    public Pair (T firstElement, T secondElement) throws Exception{
        first = firstElement;
        second = secondElement;
        if(!firstElement.getColor().equals(secondElement.getColor())) {
            throw new Exception("ColorsDoNotMatchException");
        }
        if(firstElement.getSize() != secondElement.getSize()) {
            throw new Exception("SizesDoNotMatchException");
        }

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

