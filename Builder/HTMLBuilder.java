public class HTMLBuilder implements Builder {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public void makeHeader(String header) {
        this.sb.append(String.format("<h1>%s</h1>\n", header));
    }

    @Override
    public void makeParagraph(String paragraph) {
        this.sb.append(String.format("<p>%s</p>\n", paragraph));
    }

    public String getResult() {
        return this.sb.toString();
    }
}
