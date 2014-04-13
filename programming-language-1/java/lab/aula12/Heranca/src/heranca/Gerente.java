package heranca;

public class Gerente extends Funcionario {
    private String usuario;
    private String senha;
    
    public void setUsuario(String n_usuario) {
        usuario = n_usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setSenha(String n_senha) {
        senha = n_senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
    @Override
    public double calculaBonificacao() {
        return (this.getSalario() * 0.6) + 100;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Usuário: " + this.getUsuario());
        System.out.println("Senha: " + this.getSenha());
    }
}
