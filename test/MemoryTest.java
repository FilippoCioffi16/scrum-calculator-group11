public class MemoryTest {

    public static void main(String[] args) {
        System.out.println("=== TEST UNITARIO: Memory (US8) ===");
        Memory memory = new Memory();

        // 1. Verifica che la memoria parta da 0.0
        if (memory.recall() == 0.0) {
            System.out.println("[OK] Valore iniziale della memoria = 0.0");
        } else {
            System.err.println("[FAIL] Valore iniziale errato");
        }

        // 2. Verifica dello store e recall
        memory.store(42.5);
        if (memory.recall() == 42.5) {
            System.out.println("[OK] Store e Recall funzionano correttamente (42.5)");
        } else {
            System.err.println("[FAIL] Errore in Store/Recall");
        }

        // 3. Verifica del clear
        memory.clear();
        if (memory.recall() == 0.0) {
            System.out.println("[OK] Clear risetta la memoria a 0.0");
        } else {
            System.err.println("[FAIL] Errore in Clear");
        }

        System.out.println("=== TEST MEMORY COMPLETATI ===");
    }
}
