import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o 1° lado do triângulo: ");
        double lado1 = en.nextDouble();
        System.out.print("Digite o 2° lado do triângulo: ");
        double lado2 = en.nextDouble();
        System.out.print("Digite o 3° lado do triângulo: ");
        double lado3 = en.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("\nOs lados formam um triângulo!");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Equilátero (três lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Isósceles (dois lados iguais).");
            } else {
                System.out.println("Tipo: Escaleno (três lados diferentes).");
            }
            
        } else {
            System.out.println("\nOs lados NÃO formam um triângulo!");
        }
    }
}
