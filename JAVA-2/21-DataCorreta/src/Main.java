import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = en.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Formato inválido!");
            return;
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            if (mes < 1 || mes > 12) {
                System.out.println("Data inválida: mês fora do intervalo 1-12.");
                return;
            }

            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                diasPorMes[1] = 29;
            }

            if (dia < 1 || dia > diasPorMes[mes - 1]) {
                System.out.println("Data inválida: dia fora do intervalo para o mês informado.");
            } else {
                System.out.println("Data válida!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Formato inválido! Digite números no formato dd/mm/aaaa.");
        }
    }
}
