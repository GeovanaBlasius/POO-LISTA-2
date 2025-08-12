import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        char conceito;
        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("\nNota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
