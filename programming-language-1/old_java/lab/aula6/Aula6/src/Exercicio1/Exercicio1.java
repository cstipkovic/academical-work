// Clauber Pereira Stipkovic Halic - 31243045

package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main (String[] args) {
        double media[];
        String nome[];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int n = entrada.nextInt();

        media = new double[n];
        nome = new String[n];

        System.out.println("Informe os dados dos alunos\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Nome do aluno " + (i+1) + ": ");
            nome[i] = entrada.next();
            System.out.println("Media do aluno " + (i+1) + ": ");
            media[i] = entrada.nextDouble();
        }

        // Quantidade de alunos com media 6
        int quant = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                quant++;
            }
        }
        System.out.println("Quantidade de alunos com media >= 6: " + quant);

        // procurar o melhor aluno (maior media)
        double melhor, aux;
        int indmelhor = 0;

        melhor = media[0];

        for (int i = 0; i < n; i++) {
            if (media[i] > melhor) {
                melhor = media[i];
                indmelhor = i;
            }
        }

        System.out.println("Melhor aluno é " + nome[indmelhor] + " com média " + melhor);
    }
}