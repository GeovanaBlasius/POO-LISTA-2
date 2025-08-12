import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int operacao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                resultado = num1+ num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1/num2;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado da operação: " + resultado);

            if (resultado % 1 == 0) {
                int inteiro = (int) resultado;
                if (inteiro % 2 == 0) {
                    System.out.println("O resultado é um número PAR.");
                } else {
                    System.out.println("O resultado é um número ÍMPAR.");
                }
            } else {
                System.out.println("O resultado não é inteiro, portanto não é possível determinar paridade.");
            }

            if (resultado > 0) {
                System.out.println("O resultado é POSITIVO.");
            } else if (resultado < 0) {
                System.out.println("O resultado é NEGATIVO.");
            } else {
                System.out.println("O resultado é ZERO.");
            }

            if (resultado % 1 == 0) {
                System.out.println("O resultado é um NÚMERO INTEIRO.");
            } else {
                System.out.println("O resultado é um NÚMERO DECIMAL.");
            }
        }
    }
}
