import java.util.ArrayList;
import java.util.Scanner;

public class PublicMenu {
    private PiattoSpeciale piattoSpeciale = new PiattoSpeciale();
    private Scanner scanner = new Scanner(System.in);
    String ingPrvt;

    public void mostraMenu() {

    // Mostra la lista dei possibili ingredienti pubblici e chiede all'utente di selezionarne uno
    System.out.println("Scegli un ingrediente pubblico:\n [1]Panino Normale\n [2]Panino Speciale\n");
    int indexIngredientePubblico = scanner.nextInt();
    String ingredientePubblico = piattoSpeciale.ingredientiPubblici.get(indexIngredientePubblico);
        // Aggiunge l'ingrediente pubblico alla lista degli ingredienti del piatto speciale
    piattoSpeciale.ingredientiPubblici.add(ingredientePubblico);
    // Mostra la lista dei possibili ingredienti privati e chiede all'utente di selezionarne uno
    System.out.println("Scegli un ingrediente privato:");
    System.out.println("[1] BACON");
    System.out.println("[2] UOVO");
    int ingredientePrivato = scanner.nextInt();
    // Aggiunge l'ingrediente privato alla lista degli ingredienti del piatto speciale
    if(ingredientePrivato== 1)
    {
        ingPrvt="BACON";
    }ingPrvt ="UOVO";

    piattoSpeciale.aggiungiIngredientePrivato(ingPrvt);
    // Calcola il prezzo totale del piatto speciale e lo mostra all'utente
    double prezzoTotale = piattoSpeciale.calcolaPrezzo();
    System.out.println("Il prezzo del piatto speciale è " + prezzoTotale + " euro.");
    // Chiede all'utente se vuole continuare ad ordinare
    System.out.println("Vuoi ordinare un altro piatto speciale? (s/n)");
    String risposta = scanner.next();
    if (risposta.equalsIgnoreCase("s")) {
        // Se l'utente vuole continuare, mostra nuovamente il menu
        mostraMenu();
    } else {
        // Se l'utente non vuole continuare, esce dal menu
        System.out.println("Grazie per aver ordinato!");
    }
}
}