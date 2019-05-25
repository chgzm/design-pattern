public class FileDumperProxy implements FileDumper {
    private FileDumper fileDumper; 
    private final String filePath;

    public FileDumperProxy(String filePath) {
        this.filePath = filePath;
    }
   
    @Override
    public void dump() {
        this.fileDumper = new FileDumperImpl(this.filePath);
        this.fileDumper.dump();
    }
}
