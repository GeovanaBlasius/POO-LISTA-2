import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o ano a ser verificado: ");
        int ano = en.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 == 0)) {
            System.out.println(ano + " é bissexto!");
        }
        else {
            System.out.println(ano + " não é bissexto!");
        }
    }
}