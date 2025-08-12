import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respostasSim = 0;

        String[] perguntas = {
                "Telefonou para a vítima? (S-sim/N-não)",
                "Esteve no local do crime? (S-sim/N-não)",
                "Mora perto da vítima? (S-sim/N-não)",
                "Devia para a vítima? (S-sim/N-não)",
                "Já trabalhou com a vítima? (S-sim/N-não)"
        };

        for (int i = 0; i < perguntas.length; i++) {//perguntas da string
            System.out.print(perguntas[i] + " ");
            String resposta = sc.nextLine().trim().toUpperCase();

            switch (resposta) {
                case "S":
                    respostasSim++;
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Resposta inválida, digite S para sim ou N para não.");
                    i--;//volta pergunta
                    break;
            }
        }

        System.out.println();//linha em branco

        if (respostasSim == 5) {
            System.out.println("Classificação: Assassino");
        } else if (respostasSim >= 3) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasSim == 2) {
            System.out.println("Classificação: Suspeita");
        } else {
            System.out.println("Classificação: Inocente");
        }
    }
}
