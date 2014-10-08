package Carro;

public class Automovel {
    protected String marca;
    protected int ano;
    protected String modelo;
    protected double tanqueDeCombustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTanqueDeCombustivel() {
        return tanqueDeCombustivel;
    }

    public void setTanqueDeCombustivel(double tanqueDeCombustivel) {
        this.tanqueDeCombustivel = tanqueDeCombustivel;
    }
    
    public double consumo() {
        return 1.0;
    }
    
    public String toString() {
        return "";
    }
}
