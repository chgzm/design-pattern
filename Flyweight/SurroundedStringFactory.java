import java.util.Map;
import java.util.HashMap;

public class SurroundedStringFactory {
    private final Map<String, SurroundedString> strMap = new HashMap<>();

    public SurroundedString create(String str) {
        if (this.strMap.containsKey(str)) {
            return this.strMap.get(str);
        } else {
            final SurroundedString surroundedStr = new SurroundedString(str);
            this.strMap.put(str, surroundedStr);

            return  surroundedStr;
        }
    }
}
