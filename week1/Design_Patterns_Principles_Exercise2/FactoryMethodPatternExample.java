// Author: Sharika

package Design_Patterns_Principles_Exercise2;

public class FactoryMethodPatternExample {

    interface Document {
        void open();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Word Document opened");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("PDF Document opened");
        }
    }

    static class DocumentFactory {
        public Document getDocument(String type) {
            if (type == null) {
                return null;
            }
            if (type.equalsIgnoreCase("WORD")) {
                return new WordDocument();
            } else if (type.equalsIgnoreCase("PDF")) {
                return new PdfDocument();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.getDocument("WORD");
        doc1.open();

        Document doc2 = factory.getDocument("PDF");
        doc2.open();
    }
}
