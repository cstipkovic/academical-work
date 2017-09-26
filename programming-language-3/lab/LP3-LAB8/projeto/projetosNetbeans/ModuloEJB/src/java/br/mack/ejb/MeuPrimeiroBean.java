package br.mack.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Startup;

@Singleton
@Startup
public class MeuPrimeiroBean {
    
    private static int count = 0;
    private int id = 0;

    public MeuPrimeiroBean(){
        id = count ++;
        System.out.println("Bean Criado. ID = " + this.id);
    }
    
    @PreDestroy
    public void reportaDestruicao(){
        System.out.println("Report de destruicao do Bean #" +this.id );
    }
    
    @PostConstruct
    public void reportaConstrucao(){
        System.out.println("Report de construcao do Bean #" +this.id);
    }
    
    @PostActivate
    public void reportaAtivacao(){
        System.out.println("Report de ativacao de Bean #" +this.id);
    }
    
    @PrePassivate
    public void reportaPassivacao(){
        System.out.println("Report de passivacao do Bean #" +this.id);
    }
    
    public String metodoDeNegocio(){
        System.out.println("Bean #" + this.id + " executando método de negocio.");
        return "metodo executado pelo bean #" + this.id;
    }

}
