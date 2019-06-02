import java.util.Deque;

public interface Expression {
    void interpret(Deque<Integer> deque);
}
