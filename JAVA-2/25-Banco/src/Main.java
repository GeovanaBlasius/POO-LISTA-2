import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor do saque (10 a 600): ");
        int saque = en.nextInt();

        if (saque < 10 || saque > 600) {
            System.out.println("O saque deve ser entre 1 e 600");
            return;
        }

        int notasDe100 = saque/100;
        saque = saque % 100;
        int notasDe50 = saque/50;
        saque = saque % 50;
        int notasDe10 = saque/10;
        saque = saque % 10;
        int notasDe5 = saque/5;
        saque = saque % 5;

        int notasDe1 = saque;

        System.out.println("Notas emitidas : ");
        if (notasDe100 >0 ) System.out.println("Notas de 100: " + notasDe100);
        if (notasDe50 >0 ) System.out.println("Notas de 50: " + notasDe50);
        if (notasDe10 >0 ) System.out.println("Notas de 10: " + notasDe10);
        if (notasDe5 >0 ) System.out.println("Notas de 5: " + notasDe5);
        if (notasDe1>0 ) System.out.println("Notas de 1: " + notasDe1);
    }
}