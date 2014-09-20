package tdd.chassi.util;

public class ChassiUtil {

    public int obterAno (String chassi, int posicaoAno) {
        if (chassi == null || chassi.trim().length() < 17) {
            throw new IllegalArgumentException("O chassi informado é inválido!");
        }
        
        char caractere = chassi.toUpperCase().charAt(posicaoAno - 1);
        
        return (caractere - 'A') + 2010;
    }
}
