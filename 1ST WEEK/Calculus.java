import java.lang.Math;
import java.util.Scanner;

public class Calculus {
	
	public static void main (String args[]) {
		
		//Variabli
		
		Scanner scelta = new Scanner(System.in); 	// SCANNER DELLA SCELTA DELL'OPERAZIONE
		Scanner input  = new Scanner(System.in);	// SCANNER NUMERI INSERITI IN INPUT
		Scanner selettore = new Scanner(System.in); // SCANNER SELETTORE INSERITO IN INPUT
		double pnum, snum, risultato;            	// VARIABILI PER I NUMERI INSERITI, E IL RISULTATO DELLE VARIE OPERAZIONI
		double sc;									// SCELTA DELL'OPERAZIONE	
		int sel;							 		// SCELTA DELLA APPLICAZIONE

		System.out.println("Premi 1 per usare la calcolatrice\nPremi 2 per usare il calendario\n");
		sel= selettore.nextInt();

		//controllo che il numero inserito sia compreso tra 1 e 3 // 1 per calcolatrice - 2 per calendario - 3 per cose buffe
		if(sel>=1 && sel <=3){

			switch(sel){

				//case calcolatrice
				case 1: 
				System.out.println("Quale operazione vuoi svolgere? \n");
				System.out.println( " Addizione = 1\n Sottrazione = 2\n Moltiplicazione = 3\n Divisione = 4 \n Radice = 5\n Massimo = 6\n Minimo = 7\n Modulo = 8\n ");
				sc = scelta.nextDouble();
				
				
				//Addizione
				
				if (sc == 1) 
					{
					
						System.out.println("Inserisci il primo numero: ");
						pnum = input.nextDouble();   								 //inserisco il numero nella variabile
					
						System.out.println("Inserisci il secondo numero: ");
						snum = input.nextDouble();
				
						risultato= Math.atan2(pnum, snum); 							//svolgo l'operazione con le variabili
				
						System.out.println("Il risultato dell' addizione è "+ risultato);
					
					
					}
				
				//Sottrazione
				
				if(sc== 2)
					{
						System.out.println("Inserisci il primo numero: ");
						pnum = input.nextDouble();   								 //inserisco il numero nella variabile
				
						System.out.println("Inserisci il secondo numero: ");
						snum = input.nextDouble();
				
						risultato= pnum - snum;										 //svolgo l'operazione con le variabili
				
						System.out.println("Il risultato della sottrazione è "+ risultato);
					
					
					}
		
				//Moltiplicazione
				
				if(sc== 3)
					{
						System.out.println("Inserisci il primo numero: ");
						pnum = input.nextDouble();   								 //inserisco il numero nella variabile
				
						System.out.println("Inserisci il secondo numero: ");
						snum = input.nextDouble();
				
						risultato= pnum * snum;										 //svolgo l'operazione con le variabili
				
						System.out.println("Il risultato della moltiplicazione è "+ risultato);
					
					}
				
				//Divisione
				
				if(sc== 4)
					{
						System.out.println("Inserisci il primo numero: ");
						pnum = input.nextDouble();   								 //inserisco il numero nella variabile
				
							System.out.println("Inserisci il secondo numero: ");
						snum = input.nextDouble();
				
						risultato= pnum / snum;										 //svolgo l'operazione con le variabili
				
						System.out.println("Il risultato della divisione è "+ risultato);
				
				
				}	
		
				//Radice quadrata
				
				if(sc== 5)
					{
						System.out.println("Inserisci il  numero di cui verificare la radice: ");
						pnum = input.nextDouble();   								 //inserisco il numero nella variabile
		
						
						risultato= Math.sqrt(pnum);										 //svolgo l'operazione con le variabili
						
						System.out.println("La radice del numero inserito è "+ risultato);
						
						
					}
		
				//Massimo 
				
				if(sc== 6)
				{
					System.out.println("Inserisci il primo numero: ");
					pnum = input.nextDouble();   								 //inserisco il numero nella variabile
			
					System.out.println("Inserisci il secondo numero: ");
					snum = input.nextDouble();
		
					
					risultato= Math.max(pnum, snum);										 //svolgo l'operazione con le variabili
					
					System.out.println("Il massimo tra i due numeri inseriti è  "+ risultato);
					
					
				}
		
				//Minimo 
				
				if(sc== 7)
						{
							System.out.println("Inserisci il primo numero: ");
							pnum = input.nextDouble();   								 //inserisco il numero nella variabile
					
							System.out.println("Inserisci il secondo numero: ");
							snum = input.nextDouble();
				
							
							risultato= Math.min(pnum, snum);										 //svolgo l'operazione con le variabili
							
							System.out.println("Il minimo tra i due numeri inseriti è  "+ risultato);
							
							
						}
		
				//Modulo
		
				if(sc== 8)
						{
							System.out.println("Inserisci il primo numero: ");
							pnum = input.nextDouble();   								 //inserisco il numero nella variabile
					
							System.out.println("Inserisci il secondo numero: ");
							snum = input.nextDouble();
				
							
							risultato= pnum % snum;										 //svolgo l'operazione con le variabili
							
							System.out.println("Il modulo dei due numeri inseriti è  "+ risultato);
							
							
						}
		
				else{
					System.out.println("ERRORE! SELEZIONE UN VALORE VALIDO!"); // ERRORE
				}
				
				scelta.close();
				input.close();
				break;

			//case calendario	
			case 2:
				System.out.print("Inserisci un giorno");
				int day = selettore.nextInt();
				switch(day){
					case 1:
					System.out.println("Monday");
					break;
					case 2:
					System.out.println("Tuesday");
					break;
					case 3:
					System.out.println("Wednsday");
					break;
					case 4:
					System.out.println("Thursday");
					break;
					case 5:
					System.out.println("Friday");
					break;	
					case 6:
					System.out.println("Saturday");
					break;
					case 7:
					System.out.println("Sunday");
					break;
			}
			break;

			case 3: 
			System.out.println("Quindi hai sbagliato a premere qua ?\n Vabbè vatti a fare un ripasso"); 
			scelta.close();
			input.close();
			selettore.close();
			break;
			}

		}
		return;	
	}
}
