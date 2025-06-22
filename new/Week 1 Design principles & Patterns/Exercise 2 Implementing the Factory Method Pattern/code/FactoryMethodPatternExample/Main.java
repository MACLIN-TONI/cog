import java.util.Scanner;
import factory.DocumentFactory;
import factory.WordDocumentFactory;
import factory.PdfDocumentFactory;
import factory.ExcelDocumentFactory;
import documents.Document;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a document type to open:");
        System.out.println("1 - Word Document");
        System.out.println("2 - PDF Document");
        System.out.println("3 - Excel Document");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        DocumentFactory factory = null;

        switch (choice) {
            case 1:
                factory = new WordDocumentFactory();
                break;
            case 2:
                factory = new PdfDocumentFactory();
                break;
            case 3:
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        Document doc = factory.createDocument();
        doc.open();

        scanner.close();
    }
}
