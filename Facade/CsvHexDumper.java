import java.util.List;

public class CsvHexDumper {
    private CsvHexDumper() {}
    
    public static void hexdumpCsvFile(String filePath) {
        CsvParser csvParser = new CsvParser();
        csvParser.parse(filePath);

        for (final List<String> rows : csvParser.getRows()) {
            for (final String col : rows) {
                System.out.println(StringDumper.hexdump(col));
            }
        }
    }
}
