package Aula6;

public class Carro {
    
    boolean ligado;
    double velocidadeAtual;
    double velocidadeMaxima;
    
    void ligar() {
        ligado = true;
        System.out.println("O carro esta ligado ...");
    }
    
    void buzinar() {
        System.out.println("BIBI!!!");
    }
    
    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
    
    int acelearar(double quantidade) {
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
        if (novaVelocidade >= velocidadeMaxima) {
            return -1;
        } else {
            return 0;
        }
    }
    
    int pegarMarcha() {
        if (velocidadeAtual > 0 && velocidadeAtual <= 25) {
            return 1;
        }
        
        if (velocidadeAtual > 25 && velocidadeAtual <= 40) {
            return 2;
        }
        
        if (velocidadeAtual > 40 && velocidadeAtual <= 60) {
            return 3;
        }
        
        if (velocidadeAtual > 60 && velocidadeAtual <= 80) {
            return 4;
        }
        
        if (velocidadeAtual > 80) {
            return 5;
        }
        
        return -1;
    }
    
}
