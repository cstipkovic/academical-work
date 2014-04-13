package heranca;

public class Heranca {
    public static void main (String[] args) {
        
        // Gerente
        Gerente g = new Gerente();
        g.setNome("Gggg Ggg");
        g.setSalario(2000);
        g.setUsuario(" ddd ddd ");
        g.setSenha(" 12345 ");
 
        // Telefonista
        Telefonista t = new Telefonista();
        t.setNome(" Ttttt Tt ");
        t.setSalario(1000);
        t.setEstacaoDeTrabalho(13);
 
        // Secretaria
        Secretaria s = new Secretaria();
        s.setNome(" Ssss S ");
        s.setSalario(1500);
        s.setRamal(198);
 
        System.out.println (" GERENTE ");
        g.imprimir();
        
        System.out.println (" TELEFONISTA ");
        t.imprimir();        
        
        System.out.println (" SECRETARIA ");
        s.imprimir();
    }
}