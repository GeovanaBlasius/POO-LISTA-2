import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int[] idades = new int[3];
        int soma = 0;

        // Lendo as idades
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = en.nextInt();
            soma += idades[i];
        }

        double media = (double) soma / idades.length;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
    }
}
