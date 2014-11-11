package PlanoDeSaude;

import java.util.ArrayList;

public class PlanoDeSaude {
    
    private String operadora;
    private double mensalidade;
    private String plano;
    private ArrayList<Paciente> pacientes;
    
    PlanoDeSaude(String operadora, double mensalidade, String plano) {
        this.operadora = operadora;
        this.mensalidade = mensalidade;
        this.plano = plano;
    }
    
    public void adicionaPaciente(Paciente p) {
        
    }

    public String getPacientes() {
        return "";
    }
    
    @Override
    public String toString() {
        return ("Plano de saúde " + this.operadora + " - Mensalidade " + this.mensalidade + " - Plano " + this.plano);
    }
}
