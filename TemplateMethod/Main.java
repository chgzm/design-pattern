public class Main {
    public static void main(String[] args) {
        {
            final String paragraph = "Test Paragraph";
            final FileMaker fileMaker = new HTMLTextFileMaker("test.html", paragraph.getBytes());
            fileMaker.process();
        }

        {
            final byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
            final FileMaker fileMaker = new BinaryFileMaker("test.dat", bytes);
            fileMaker.process();
        }
    }
}  
