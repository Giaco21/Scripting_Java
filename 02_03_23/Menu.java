import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Official {
    public static void main(String[] args) {
        ArrayList<String> ingredientiPublic = new ArrayList<>();
        ArrayList<Double> prezziPublic = new ArrayList<>();
        ingredientiPublic.add("Panino normale");
        prezziPublic.add(2.0);
        ingredientiPublic.add("Panino di sesamo");
        prezziPublic.add(2.5);

        Piatto_Speciale piatto = new Piatto_Speciale(ingredientiPublic, prezziPublic);

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            piatto.stampaIngredientiPublic();
            System.out.println("Inserisci il numero dell'ingrediente pubblico che vuoi aggiungere (0 per terminare):");
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                continua = false;
            } else if (scelta < 1 || scelta > ingredientiPublic.size()){
                System.out.println("Scelta non valida! ");
            }else {
                piatto.addIngredientePrivate(ingredientiPublic.get(scelta -1), prezziPublic.get(scelta -1 ));
            }
        }
        piatto.stampaIngredientiPrivate();
        System.out.println("Inserisci gli ingredienti privati che vuoi aggiungere ( uno alla volta, [0] per termimare): ");
        boolean continuaPrivate = true;
        while(continuaPrivate){
            String ingrediente = scanner.next();
            if (ingrediente.equals("0")) {
                continuaPrivate = false;
            } 
            else {
                System.out.println("Inserisci il prezzo dell'ingrediente " + ingrediente + ":");
                double prezzo = scanner.nextDouble();
                piatto.addIngredientePrivate(ingrediente, prezzo);
            }
        }

        System.out.println("Il prezzo totale del piatto è: " + piatto.calcolaPrezzo() + " euro.");
    }
}