package mack.entities;

public class Usuario {
    
<<<<<<< HEAD
    public int id;
    public String nome;
    public String sobrenome;
=======
    private int id;
    private String nome;
    private String sobrenome;
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f

    public Usuario(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
<<<<<<< HEAD
    }
=======
    }   
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
<<<<<<< HEAD
    
    @Override
=======

>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f
    public String toString() {
        StringBuffer sbResult = new StringBuffer();
        
        sbResult.append("id = ");
        sbResult.append(id);
        sbResult.append(", nome = ");
        sbResult.append(nome);
        sbResult.append(", sobrenome = ");
        sbResult.append(sobrenome);
        
        return sbResult.toString();
    }
<<<<<<< HEAD
=======
    
    
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f
}
