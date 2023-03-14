import java.util.Scanner;

public class ShapesMain {
    public static void main(String[] args) {

        // Creazione di una nuova istanza della classe ShapeManager
        ShapeManager shapeManager = new ShapeManager();

        // Creazione di un oggetto Scanner per leggere gli input dell'utente da console
        Scanner scanner = new Scanner(System.in);

        // Ciclo di scelta della forma geometrica da inserire
        boolean continueAddingShapes = true;
        while (continueAddingShapes) {
            System.out.println(
                    "Cerchio se vuoi creare un cerchio\n Quadrato se vuoi creare un quadrato\n Rettangolo se vuoi creare un rettangolo\n Totale area per conoscere il totale dell'area di tutte le forme aggiunte\n Totale perimetro per conoscere il totale del perimetro di tutte le forme inserite\n Uscita per uscire\n:");
            String shapeType = scanner.nextLine();

            switch (shapeType.toLowerCase()) {
                case "cerchio":
                    System.out.println("Inserisci il raggio del cerchio:");
                    double radius = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il carattere di fine linea
                    Circle circle = new Circle(radius);
                    shapeManager.addShape(circle);
                    break;
                case "rettangolo":
                    System.out.println("Inserisci la base del rettangolo:");
                    double base = scanner.nextDouble();
                    System.out.println("Inserisci l'altezza del rettangolo:");
                    double height = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il carattere di fine linea
                    Rectangle rectangle = new Rectangle(base, height);
                    shapeManager.addShape(rectangle);
                    break;
                case "quadrato":
                    System.out.println("Inserisci il lato del quadrato:");
                    double side = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il carattere di fine linea
                    Square square = new Square(side);
                    shapeManager.addShape(square);
                    break;
                case "totale area":
                    System.out.println("Total Area: " + shapeManager.getTotalArea());
                    break;
                case "totale perimetro":
                    System.out.println("Total Perimeter: " + shapeManager.getTotalPerimeter());
                    break;
                case "uscita":
                    continueAddingShapes = false;
                    break;
                default:
                    System.out.println("Tipo di forma geometrica non supportato.");
            }
        }
    }
}