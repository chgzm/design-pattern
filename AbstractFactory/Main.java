public class Main {
    public static Factory createFactory(String name) {
        switch (name) {
        case "HTML":     { return new HTMLFactory();     }
        case "Markdown": { return new MarkdownFactory(); }
        default:       { throw  new IllegalArgumentException("Invalid name."); }
        }
    }

    public static void main(String[] args) {
        {
            Factory factory = createFactory("HTML");
            
            Page page = new Page();
            page.addElement(factory.createHeading("Heading text1"));
            page.addElement(factory.createParagraph("Paragraph text1"));
            page.addElement(factory.createHeading("Heading text2"));
            page.addElement(factory.createParagraph("Paragraph text2"));

            System.out.println(page);
        }
        
         {
            Factory factory = createFactory("Markdown");
            
            Page page = new Page();
            page.addElement(factory.createHeading("Heading text1"));
            page.addElement(factory.createParagraph("Paragraph text1"));
            page.addElement(factory.createHeading("Heading text2"));
            page.addElement(factory.createParagraph("Paragraph text2"));

            System.out.println(page);
        }
               
    }
}
