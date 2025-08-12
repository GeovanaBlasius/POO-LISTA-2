import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        int acertos = 0;

        System.out.println("Prova com 10 questões");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print("Resposta da questão " + (i+1) + ": ");
            char resposta = sc.nextLine().toLowerCase().charAt(0);  //primeiro caractere minúsculo
            respostas[i] = resposta;

            if (resposta == gabarito[i]) {
                acertos++;
            }
        }

        System.out.println();
        System.out.println("\nResultado");
        System.out.println("Respostas do candidato:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Questão " + (i+1) + ": " + respostas[i]);
        }
        System.out.println();
        System.out.println("Total de acertos: " + acertos);
    }
}
