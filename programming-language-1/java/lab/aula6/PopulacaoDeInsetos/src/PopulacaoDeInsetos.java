public class PopulacaoDeInsetos {
    
    int insetos;
    
    public PopulacaoDeInsetos() {
        this.insetos = 1000;
    }

    public PopulacaoDeInsetos(int insetos) {
        this.insetos = insetos;
    }
    
    public int getInsetos() {
        return this.insetos;
    }
    
    public int procriar() {
        return (this.insetos * 2);
    }
    
    public int pulverizar() {
        return (this.insetos / 2);
    }
}
