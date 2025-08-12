import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        if (a != 0) {
            System.out.print("Digite o valor de B: ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = sc.nextDouble();

            double delta = b * b - 4 * a * c;

            System.out.println("\nValor de delta: " + delta);

             if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + raiz);
            } else if (delta >0){
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais:");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
            else if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            }
        }
        else{
                System.out.println("Não é uma equação do segundo grau. Encerrando o programa.");
                sc.close();
        }
    }
}
