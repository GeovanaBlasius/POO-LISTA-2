import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um numero correspondente ao dia da semana (1 até 7): ");
        switch(en.nextInt()){
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda!");
                break;
            case 3:
                System.out.println("Terça!");
                break;
            case 4:
                System.out.println("Quarta!");
                break;
            case 5:
                System.out.println("Quinta!");
                break;
            case 6:
                System.out.println("Sexta!");
                break;
            case 7:
                System.out.println("Sabado!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}