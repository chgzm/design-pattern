import java.util.List;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class CsvParser {
    private final List<List<String>> rows = new ArrayList<>();

    public void parse(String filePath) {
        try {
            final List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

            for (final String line : lines) {
                final String[] cols = line.split(",");
                final List<String> colList = new ArrayList<>();
                for (final String col : cols) {
                    colList.add(col);
                }

                this.rows.add(colList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<List<String>> getRows() {
        return this.rows;
    }
}
