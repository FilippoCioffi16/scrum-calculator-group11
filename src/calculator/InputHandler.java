
import java.util.Scanner;

public class InputHandler {
    // .useLocale(Locale.US) garantisce l'uso del punto (.) come separatore decimale
    private final Scanner scanner = new Scanner(System.in);

    public double readNumber(String prompt) { 
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Input non valido. Inserisci un numero reale: ");
            scanner.next();
        }
        return scanner.nextDouble(); 
    }

    public int readChoice() { 
        System.out.print("Scegli un'opzione: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Input non valido. Inserisci un numero intero valido: ");
            scanner.next();
        }
        return scanner.nextInt(); 
    }

    public void printMenu() { 
        System.out.println("\n=== CALCOLATRICE - SPRINT 1 ===");
        System.out.println("1. Addizione (+)");
        System.out.println("2. Sottrazione (-)");
        System.out.println("3. Moltiplicazione (*)");
        System.out.println("4. Divisione (/)");
        System.out.println("5. Mostra l'ultimo risultato ottenuto");
        System.out.println("0. Esci");
    }     
}
