package Carro;

public class Carro {
    
    private float consumo;
    private float capacidade;
    private float qtdCombustivel;
    
    public Carro () {
        consumo = 14.0f;
        capacidade = 50.0f;
        qtdCombustivel = 0.0f;
    }
    
    public float consultar () {
        return qtdCombustivel;
    }
    
    public void abastercer (float combustivel) {
        qtdCombustivel = qtdCombustivel + combustivel;
    }
    
    public void rodar (float km) {
        qtdCombustivel = qtdCombustivel - (km / consumo);
    }
}
