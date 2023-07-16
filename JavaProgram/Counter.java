package JavaProgram;
public class Counter implements AutoCloseable {
    static int sum = 0;

    public void add() {
        sum++;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}
