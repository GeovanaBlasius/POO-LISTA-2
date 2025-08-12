import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Informe a primeira nota : ");
        float nota1 = en.nextFloat();
        System.out.println("Informe a segunda nota : ");
        float nota2 = en.nextFloat();
        System.out.println("Informe a segunda nota : ");
        float nota3 = en.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        if (media == 10) {
            System.out.println("APROVADO com distinção, Média " + media);
        }
        else if(media>=7 && media < 10){
            System.out.println("Aprovado com média " + media);
        }else {
            System.out.println("Reprovado com média " + media );
        }
    }
}