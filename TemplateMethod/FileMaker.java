import java.io.IOException;

public abstract class FileMaker {
    protected final String filePath;
    protected final byte[] data;

    public FileMaker(String filePath, byte[] data) {
        this.filePath = filePath;
        this.data     = data;
    }

    public abstract void openFile()  throws IOException;
    public abstract void write()     throws IOException;
    public abstract void closeFile() throws IOException;

    public final void process() {
        try {
           this.openFile();
           this.write();
           this.closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
