package exemplo3;

public class Exemplo3 {

    public static void main(String[] args) {
        byte[] bytes = {77, 97, 99, 107};
        String s = new String(bytes);
        String s2 = new String(s);
        System.out.println(s2);
    }
}
