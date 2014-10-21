package socio;

public class Socio {
    
    protected String nomeTitular;
    protected String sobrenomeTitular;
    protected int opcAcademia = 0;
    protected int opcAluguelArmario = 0;
    protected float mensalidade = 0;
    protected float total;
    
    public Socio() {
        setMensalidade((float) 120.00);
    }
    
    public void calculaMensalidade() {
        float total;
        
        total = getMensalidade() + (float) getOpcAcademia() + (float) getOpcAluguelArmario();
        setTotal(total);
    }
    
    public void exibeDados() {
        System.out.println("Dados do associado");
        System.out.println("==================");
        
        System.out.println("Titular: " + getSobrenomeTitular().toUpperCase() + ", " + getNomeTitular().toUpperCase());
        System.out.println("Valor a pagar: R$" + getTotal());
        
        System.out.print(
                "Valor referente a mensalidade (R$" + getMensalidade() + ")" +
                ", ao uso da academia (R$" + getOpcAcademia() + ")" +
                " e ao aluguel do armário (R$" + getOpcAluguelArmario() + ")."
        );
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getSobrenomeTitular() {
        return sobrenomeTitular;
    }

    public void setSobrenomeTitular(String sobrenomeTitular) {
        this.sobrenomeTitular = sobrenomeTitular;
    }

    public int getOpcAcademia() {
        return opcAcademia;
    }

    public void setOpcAcademia(int opcAcademia) {
        this.opcAcademia = opcAcademia;
    }

    public int getOpcAluguelArmario() {
        return opcAluguelArmario;
    }

    public void setOpcAluguelArmario(int opcAluguelArmario) {
        this.opcAluguelArmario = opcAluguelArmario;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
