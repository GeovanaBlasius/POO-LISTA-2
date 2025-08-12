import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int num = -1;

        for (;;) {
            System.out.print("Digite um número inteiro menor que 1000: ");
            num = en.nextInt();

            if (num >= 0 && num < 1000) {
                break; // sai do loop quando for valido
            } else {
                System.out.println("Número inválido! Tente novamente.");
            }
        }

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);
    }
}
