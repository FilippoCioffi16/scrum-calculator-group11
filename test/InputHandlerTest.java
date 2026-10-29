import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputHandlerTest {

    public static void main(String[] args) {
        System.out.println("=== TEST UNITARIO: InputHandler ===");

        InputStream originalIn = System.in; // Salva l'input standard originale

        try {
            // --- Test 1: Lettura di un numero valido ---
            String simulatedInput1 = "12.5\n";
            System.setIn(new ByteArrayInputStream(simulatedInput1.getBytes()));
            InputHandler handler1 = new InputHandler();
            double num = handler1.readNumber("Inserisci un numero: ");
            if (num == 12.5) {
                System.out.println("[OK] Test Numero Valido Superato!");
            } else {
                System.err.println("[FAIL] Test Numero Valido Fallito!");
            }

            // --- Test 2: Gestione di input errato seguito da input valido (Representation Check) ---
            // Simula l'utente che scrive "abc" (non valido) e poi "5" (valido)
            String simulatedInput2 = "abc\n5\n";
            System.setIn(new ByteArrayInputStream(simulatedInput2.getBytes()));
            InputHandler handler2 = new InputHandler();
            int choice = handler2.readChoice();
            if (choice == 5) {
                System.out.println("[OK] Test Recupero Input Errato Superato!");
            } else {
                System.err.println("[FAIL] Test Recupero Input Errato Fallito!");
            }

        } finally {
            System.setIn(originalIn); // Ripristina l'input di sistema originale
        }

        System.out.println("=== TEST INPUT HANDLER COMPLETATI ===");
    }
}
