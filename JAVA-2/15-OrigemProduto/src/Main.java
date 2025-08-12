import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o preço do produto : R$ ");
        double preco = en.nextDouble();
        System.out.print("Digite o código de origem do produto : ");
        int codigo = en.nextInt();

        String procedencia;

        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-Oeste";
                break;
            default:
                procedencia = "Importado";
                break;
        }

        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Procedência: " + procedencia);
    }
}
