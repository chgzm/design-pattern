import java.util.Deque;

public class Plus implements Expression {
    @Override
    public void interpret(Deque<Integer> deque) {
        deque.push(deque.pop() + deque.pop());   
    }
}
