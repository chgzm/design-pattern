import java.util.List;

public class CsvHexDumper {
    private CsvHexDumper() {}
    
    public static void hexdumpCsvFile(String filePath) {
        CsvParser csvParser = new CsvParser();
        csvParser.parse(filePath);

        for (final List<String> row : csvParser.getRows()) {
            for (final String col : row) {
                System.out.println(StringDumper.hexdump(col));
            }
        }
    }
}
