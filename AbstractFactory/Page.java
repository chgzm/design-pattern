import java.util.List;
import java.util.ArrayList;

public class Page {
    private final List<Element> elementList = new ArrayList<>();

    public void addElement(Element e) {
        this.elementList.add(e);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (final Element e : this.elementList) {
            sb.append(e).append("\n");
        }

        return sb.toString();
    }  
}
