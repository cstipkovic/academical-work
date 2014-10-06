package Tutorial.Composicao;

public class Motor {
    
    private String tipo;
    
    Motor(String tipo) {
        this.tipo = tipo;
    }
    
    public String retornaTipo() {
        return this.tipo;
    }
}
