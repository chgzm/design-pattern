import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        StringTokenizer tokenizer = null;
        try {
            final byte[] bytes = Files.readAllBytes(Paths.get("command.txt"));
            tokenizer = new StringTokenizer(new String(bytes, StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Calculator calculator = new Calculator(tokenizer); 
        
        System.out.println(calculator.execute());
    }
}
