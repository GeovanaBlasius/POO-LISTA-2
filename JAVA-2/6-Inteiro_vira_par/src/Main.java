import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Vamos Mudar Os Números!!!");
        System.out.println("-".repeat(30));
        System.out.print("Informe um número: ");
        int num = en.nextInt();

        if(num % 2 == 0){
            num = num + 1;
            System.out.println("É PAR, mas transformei em Ímpar -> " + num);
        }
        else {
            num = num + 1;
            System.out.println("É ÍMPAR, mas transformei em par -> " + num);
        }
    }
}