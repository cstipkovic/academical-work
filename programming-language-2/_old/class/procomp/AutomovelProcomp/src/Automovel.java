public class Automovel {

    static int numeroRodas = 4;
    String modelo;

    public Automovel(String modelo) {
        this.modelo = modelo;
    }
    
    static void incrementarRodas() {
        numeroRodas++;
    }
    
    @Override
    public String toString() {
        return "[" + modelo + ";" + numeroRodas + " rodas]";
    }
}
