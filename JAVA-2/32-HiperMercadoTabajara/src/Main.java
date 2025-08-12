import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Promoção de Carnes - Hipermercado Tabajara");
        System.out.println("Tipos disponíveis: ");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipo = sc.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        double quantidade = sc.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - Cartão Tabajara (5% de desconto)");
        System.out.println("2 - Outros");
        System.out.print("Escolha a forma de pagamento (1 ou 2): ");
        int pagamento = sc.nextInt();

        String nomeCarne = "";
        double precoPorKg = 0;

        switch (tipo) {
            case 1:
                nomeCarne = "Filé Duplo";
                if (quantidade <= 5) {
                    precoPorKg = 4.90;
                } else {
                    precoPorKg = 5.80;
                }
                break;
            case 2:
                nomeCarne = "Alcatra";
                if (quantidade <= 5) {
                    precoPorKg = 5.90;
                } else {
                    precoPorKg = 6.80;
                }
                break;
            case 3:
                nomeCarne = "Picanha";
                if (quantidade <= 5) {
                    precoPorKg = 6.90;
                } else {
                    precoPorKg = 7.80;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                return;
        }

        double precoTotal = quantidade * precoPorKg;
        double desconto = 0;

        if (pagamento == 1) {
            desconto = precoTotal * 0.05; // 5% desconto
        }

        double valorAPagar = precoTotal - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));

        if (pagamento == 1) {
            System.out.println("Tipo de pagamento: Cartão Tabajara");
        } else {
            System.out.println("Tipo de pagamento: Outro");
        }

        System.out.println("Valor do desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorAPagar));
    }
}
