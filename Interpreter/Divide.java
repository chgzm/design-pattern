import java.util.Deque;

public class Divide implements Expression {
    @Override
    public void interpret(Deque<Integer> deque) {
        final int denom = deque.pop();
        deque.push(deque.pop() / denom);   
    }
}
