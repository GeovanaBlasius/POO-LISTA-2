import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = en.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = en.nextInt();

        if(num>num2){
            System.out.println("O maior numero é "+ num );
        }
        else {
            System.out.println("O maior Númeor é " + num2);
        }
    }
}
