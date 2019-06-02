import java.util.Deque;

public class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Deque<Integer> deque) {
        deque.push(this.number);
    }
}
