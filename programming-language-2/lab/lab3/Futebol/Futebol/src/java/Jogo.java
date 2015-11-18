
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 31056318
 */
public class Jogo {

    private Equipe equipe1;
    private Equipe equipe2;
    private Local local;
    private LocalDateTime data;

    public Jogo() {
    }

    public Jogo(Equipe equipe1, Equipe equipe2, Local local, LocalDateTime data) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.local = local;
        this.data = data;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Jogo{" + "equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", local=" + local + ", data=" + data + '}';
    }

}
