package PlanoDeSaude;

public class main {
    
    public static void main(String args[]) {
        PlanoDeSaude p11 = new PlanoDeSaude("Amil", 350.00, "Blue 500");
        PlanoDeSaude p12 = new PlanoDeSaude("Unimed", 235.00, "Basico");
        p11.adicionaPaciente(new Paciente("Fulano de tal", 20));
        p11.adicionaPaciente(new Paciente("Beltrano de tal", 55));
        p12.adicionaPaciente(new Paciente("Beltrano da Silva", 22));
        p12.adicionaPaciente(new Paciente("Sicrano da Silva", 31));
        System.out.println(p11);
        System.out.println(p11.getPacientes());
        System.out.println(p12);
        System.out.println(p12.getPacientes());
    }
}
