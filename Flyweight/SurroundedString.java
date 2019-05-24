import java.util.List;
import java.util.ArrayList;

public class SurroundedString {
    private final String content;

    public SurroundedString(String str) {
        System.out.println("Create surrounded string.");
        final StringBuilder sb = new StringBuilder();
        
        sb.append("|");
        for (int i = 0; i < str.length(); ++i) {
            sb.append("-");
        }

        sb.append("|\n|").append(str).append("|\n|");

        for (int i = 0; i < str.length(); ++i) {
            sb.append("-");
        }
        sb.append("|");

        this.content = sb.toString();
    } 

    @Override
    public String toString() {
        return this.content;
    }
}

