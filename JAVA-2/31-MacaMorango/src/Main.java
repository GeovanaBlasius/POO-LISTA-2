import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a quantidade de morangos (Kg): ");
        double kgMorango = sc.nextDouble();
        System.out.print("Digite a quantidade de maçãs (Kg): ");
        double kgMaca = sc.nextDouble();

        double precoMorango;
        double precoMaca;

        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double total = totalMorango + totalMaca;

        double totalKg = kgMorango + kgMaca;

        if (totalKg > 8 || total > 25.00) {
            total = total - (total * 0.10); // desconto de 10%
        }

        System.out.println("\nResumo da compra:");
        System.out.println("Morango: " + kgMorango + " Kg - R$ " + totalMorango);
        System.out.println("Maçã: " + kgMaca + " Kg - R$ " + totalMaca);
        System.out.println("Total a pagar: R$ " + total);
    }
}
