public class MarkdownBuilder implements Builder {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public void makeHeader(String header) {
        this.sb.append(String.format("# %s\n", header));
    }

    @Override
    public void makeParagraph(String paragraph) {
        this.sb.append(String.format("%s\n", paragraph));
    }

    public String getResult() {
        return this.sb.toString();
    }
}
