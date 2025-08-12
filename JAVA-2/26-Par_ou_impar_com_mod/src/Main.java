import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = en.nextDouble();

        long arredondado = Math.round(num);

        if (num == arredondado) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
    }
}
