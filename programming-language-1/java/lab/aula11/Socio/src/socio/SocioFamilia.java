package socio;

public class SocioFamilia extends Socio {
    
    protected int qtdeDependentes = 0;
    
    public SocioFamilia() {
        setMensalidade((float) 160.00);
    }

    public int getQtdeDependentes() {
        return qtdeDependentes;
    }

    public void setQtdeDependentes(int qtdeDependentes) {
        this.qtdeDependentes = qtdeDependentes;
    }
}
