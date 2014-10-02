package Tutorial.Composicao;

public class Carro {
    
    private String marca;
    private String modelo;
    private String fabricante;
    
    Carro(String marca, String modelo, String fabricante) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    public String retornaMarca() {
        return this.marca;
    }
    
    public String retornaModelo() {
        return this.modelo;
    }
    
    public String retornaFabricante() {
        return this.fabricante;
    }
}
