import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Informe um número :");
         int numero = input.nextInt();

        if (numero < 0 ) {
            System.out.println("O valor informado é Negativo");
        }
        else if (numero > 0) {
            System.out.println("O valor informado É POSITIVO");
        }
        else {
            System.out.println("O valor informado é ZERO");
        }
    }
}