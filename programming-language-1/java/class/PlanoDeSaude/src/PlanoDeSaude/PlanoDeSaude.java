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
        pacientes = new ArrayList<Paciente>();
    }
    
    public void adicionaPaciente(Paciente p) {
        this.pacientes.add(p);
    }

    public String getPacientes() {
        String listaPacientes = "";
        
        for (int i = 0; i < this.pacientes.size(); i++) {
            listaPacientes += this.pacientes.get(i) + "\n";
        }
        
        return listaPacientes;
    }
    
    @Override
    public String toString() {
        return ("Plano de saúde " + this.operadora + " - Mensalidade " + this.mensalidade + " - Plano " + this.plano);
    }
}
