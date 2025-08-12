import java.lang.classfile.constantpool.DoubleEntry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario: ");
        double salario = en.nextDouble();
        double salarioFinal = 0;
        double aumento = 0;
        double percentual = 0;

        if (salario <= 280) {
            percentual = 0.20;
            aumento =  salario * 0.20;
            salarioFinal = salario + aumento;
        }else if (salario > 280 && salario <= 700) {
            percentual = 0.15;
            aumento =  salario * 0.15;
            salarioFinal = salario + aumento;
        }else if (salario >= 700 && salario <= 1500) {
            percentual = 0.10;
            aumento =  salario * 0.10;
            salarioFinal = salario + aumento;
        }else if (salario > 1500 ) {
            percentual = 0.5;
            aumento =  salario * 0.5;
            salarioFinal = salario + aumento;
        }
        System.out.println("Salário antes do reajuste: R$ " + String.format("%.2f",salario));
        System.out.println("Foi aplicado um reajuste de : " + String.format("%.0f%%",percentual*100));
        System.out.println("Aumento de: R$ " +  String.format("%.2f",aumento) );
        System.out.println("Salário final : R$ " +  String.format("%.2f",salarioFinal));
    }
}