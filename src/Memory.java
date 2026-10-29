public class Memory {
    
    private double value = 0;
    
    // Salva il valore passato in memoria
    public void store(double v) { 
        this.value = v;
    }

    // Restituisce il valore attualmente memorizzato
    public double recall() { 
        return this.value; 
    }

    // Azzera la memoria riportandola a 0
    public void clear() { 
        this.value = 0;
    }
}