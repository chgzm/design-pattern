import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileDumperImpl implements FileDumper {
    private final String filePath;

    public FileDumperImpl(String filePath) {
        this.filePath = filePath;
    }
   
    @Override
    public void dump() {
        try {
            final byte[] bytes = Files.readAllBytes(Paths.get(this.filePath));        
            this.hexdump(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void hexdump(byte[] bytes) {
        for (int i = 0; i < bytes.length; ++i) {
            System.out.printf(String.format("%02x", bytes[i]));

            if ((i + 1) % 16 == 0) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println("");
    }
}
