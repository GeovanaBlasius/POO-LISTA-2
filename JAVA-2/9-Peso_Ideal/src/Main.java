import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        char sexo = 'n';
        while (sexo != 'f' || sexo != 'm') {
            System.out.println("Informe seu sexo: F->(feminino) M->(masculino) ");
            sexo = en.next().toLowerCase().charAt(0);
        }

        System.out.println("Informe sua altura (em Metros): ");
        float altura = en.nextFloat();

        System.out.println("Informe sua peso (em Kg): ");
        float peso = en.nextFloat();

        double pesoideal;
        String ssexo;

        if (sexo == 'f') {
            ssexo = "Feminino";
            pesoideal = ((62.1*altura) - 44.7);
        }
        else {
            ssexo = "Masculino";
            pesoideal = ((72.7*altura) - 58);
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + ssexo);
        System.out.println("Peso ideal: " + pesoideal + " kg");

        if (peso > pesoideal) {
            System.out.println("Está acima do peso ideal");
        } else if (peso < pesoideal) {
            System.out.println("Está abaixo do peso ideal");
        } else {
            System.out.println("Está no peso ideal");
        }
    }
}
