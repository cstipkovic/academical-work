package Carro;

public class Popular extends Automovel{
    private String tipoDoMotor;
    private int qtDePortas;

    public String getTipoDoMotor() {
        return tipoDoMotor;
    }

    public void setTipoDoMotor(String tipoDoMotor) {
        this.tipoDoMotor = tipoDoMotor;
    }

    public int getQtDePortas() {
        return qtDePortas;
    }

    public void setQtDePortas(int qtDePortas) {
        this.qtDePortas = qtDePortas;
    }
    
    @Override
    public double consumo() {
        return 1.0;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
