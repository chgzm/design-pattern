import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;


public class Calculator {
    private final List<Expression> exprList = new ArrayList<>();

    public Calculator(StringTokenizer tokenizer) {
        while (true == tokenizer.hasMoreTokens()) {
            final String token = tokenizer.nextToken();
            switch (token) {
            case "+": { exprList.add(new Plus());                          break; }
            case "-": { exprList.add(new Minus());                         break; }
            case "*": { exprList.add(new Multiple());                      break; }
            case "/": { exprList.add(new Divide());                        break; }
            default:  { exprList.add(new Number(Integer.parseInt(token))); break; }
            }
        }
    }

    public int execute() {
        final Deque<Integer> deque = new ArrayDeque<>();
        for (final Expression expr : this.exprList) {
            expr.interpret(deque);
        }

        return deque.pop();
    }
}
