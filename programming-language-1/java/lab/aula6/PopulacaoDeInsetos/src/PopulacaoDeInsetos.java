public class PopulacaoDeInsetos {
    
    int insetos;
    
    public PopulacaoDeInsetos() {
        this.insetos = 1000;
    }

    public PopulacaoDeInsetos(int insetos) {
        this.insetos = 1500 + insetos;
    }
    
    public int getInsetos() {
        return this.insetos;
    }
}
