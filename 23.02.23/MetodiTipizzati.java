import java.util.Scanner;

public class MetodiTipizzati {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Scegli il tipo di dato (1=int, 2=double, 3=string, 4=bool): ");
        int scelta = input.nextInt();
        
        switch (scelta) {
            case 1:
                System.out.println("Prego inserisca un numero: ");
                int numInt = input.nextInt();
                stampaValore(numInt);
                break;
            case 2:
                System.out.println("Prego inserisca un double: ");
                double numDouble = input.nextDouble();
                stampaValore(numDouble);
                break;
            case 3:
                System.out.println("Prego inserisca una stringa: ");            
                String stringa = input.nextLine();
                stampaValore(stringa);
                break;
            case 4:
                boolean valoreBool = true;
                stampaValore(valoreBool);
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    }
    
    public static void stampaValore(int valore) {
        System.out.println("Valore int: " + valore);
    }
    
    public static void stampaValore(double valore) {
        System.out.println("Valore double: " + valore);
    }
    
    public static void stampaValore(String valore) {
        System.out.println("Valore string: " + valore);
    }
    
    public static void stampaValore(boolean valore) {
        System.out.println("Valore boolean: " + valore);
    }
}