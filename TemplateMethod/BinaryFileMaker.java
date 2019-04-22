import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BinaryFileMaker extends FileMaker {
    private BufferedOutputStream bos;

    public BinaryFileMaker(String filePath, byte[] data) {
        super(filePath, data);
    }

    @Override
    public void openFile() throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(this.filePath);
        } catch (IOException e) {
            if (fos != null) {
                fos.close();
            }
            throw e;
        }

        this.bos = new BufferedOutputStream(fos);
    }
   
    @Override
    public void write() throws IOException {
        try {
            this.bos.write(data);
        } catch (IOException e) {
            this.bos.close();
            throw e;
        }
    }

    @Override
    public void closeFile() throws IOException {
        this.bos.close();
    }
}
