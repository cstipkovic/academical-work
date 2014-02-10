package exemplo5;

public class Exemplo5 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Bem vindo");
        sb.append(" ao Mack.");
        String s = new String(sb);
        System.out.println(s);
    }
}
