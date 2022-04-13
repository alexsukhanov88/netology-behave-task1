import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int minLimit;
    protected int maxLimit;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.maxLimit = max;
        this.minLimit = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random
                        .ints(1, minLimit, maxLimit + 1)
                        .findFirst()
                        .getAsInt();
            }
        };
    }
}