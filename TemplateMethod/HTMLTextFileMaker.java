import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class HTMLTextFileMaker extends FileMaker {
    private PrintWriter pw;

    public HTMLTextFileMaker(String filePath, byte[] data) {
        super(filePath, data);
    }

    @Override
    public void openFile() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = Files.newBufferedWriter(Paths.get(filePath));
        } catch (IOException e) {
            if (bw != null) {
                bw.close(); 
            }
            throw e;
        }

        this.pw = new PrintWriter(bw); 
    }
   
    @Override
    public void write() {
        this.pw.printf("<h1>HTMLText</h1>\n<p>%s</p>\n", new String(this.data));
    }

    @Override
    public void closeFile() throws IOException {
        this.pw.close();
    }
}
