import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        double valorHora = en.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horas = en.nextDouble();

        double salarioBruto = valorHora * horas;

        double descontoIR = 0;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }

        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = descontoIR + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR: R$ " + String.format("%.2f", descontoIR));
        System.out.println("(-) Sindicato: R$ " + String.format("%.2f", descontoSindicato));
        System.out.println("FGTS: R$ " + String.format("%.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}
