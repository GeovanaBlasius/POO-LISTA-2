import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int maior, menor;

        System.out.print("Digite um número: ");
        int num = en.nextInt();
        maior = num;
        menor = num;

        for(int i = 2; i <= 3; i++) {
            System.out.print("Digite um número: ");
            num = en.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
    }
}
