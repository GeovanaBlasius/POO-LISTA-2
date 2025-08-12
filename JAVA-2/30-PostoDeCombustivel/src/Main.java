import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();
        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double precoLitro;
        double descontoPorcentagem;

        if (tipo == 'A') {
            precoLitro = precoAlcool;
            if (litros <= 20) {
                descontoPorcentagem = 3;
            } else {
                descontoPorcentagem = 5;
            }
        }
        else if (tipo == 'G') {
            precoLitro = precoGasolina;
            if (litros <= 20) {
                descontoPorcentagem = 4;
            } else {
                descontoPorcentagem = 6;
            }
        }
        else {
            System.out.println("Tipo de combustível inválido!");
            sc.close();
            return;
        }

        double valorSemDesconto = litros * precoLitro;
        double valorDesconto = valorSemDesconto * (descontoPorcentagem / 100);
        double valorFinal = valorSemDesconto - valorDesconto;
        System.out.println("\nResumo da compra:");
        System.out.println("Tipo de combustível: " + (tipo == 'A' ? "Álcool" : "Gasolina"));
        System.out.println("Quantidade: " + litros + " litros");
        System.out.println("Preço por litro: R$ " + precoLitro);
        System.out.println("Desconto: " + descontoPorcentagem + "%");
        System.out.println("Valor a pagar: R$ " + valorFinal);
    }
}
