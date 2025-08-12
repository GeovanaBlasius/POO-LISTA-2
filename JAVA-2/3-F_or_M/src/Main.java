import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.printf("Digite F(Feminino) ou M(Masculino): ");
        char genero = en.next().charAt(0);

        if (genero == 'F' ){
            System.out.println("F - Feminino");
        }
        else if (genero == 'M' ){
            System.out.println("M - Masculino");
        }
        else{
            System.out.println("Valor inválido recompile o código ( Informe com letras maiusculas)!!");
        }

    }
}