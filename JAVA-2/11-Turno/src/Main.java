import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String turno = "";
        boolean valido = false;

        while (!valido) {
            System.out.println("Em que turno você estuda?");
            System.out.println("Digite M- Matutino, V- Vespertino ou N- Noturno:");
            turno = leer.next().toUpperCase();

            switch (turno) {
                case "M":
                    System.out.println("Bom Dia!");
                    valido = true;
                    break;
                case "V":
                    System.out.println("Boa Tarde!");
                    valido = true;
                    break;
                case "N":
                    System.out.println("Boa Noite!");
                    valido = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }
}
