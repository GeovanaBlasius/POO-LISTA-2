import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Informe a primeira nota : ");
        float nota1 = en.nextFloat();
        System.out.println("Informe a segunda nota : ");
        float nota2 = en.nextFloat();
        float media = (nota1 + nota2)/2;

        if(media>=6){
            System.out.println("Aprovado com média " + media);

        }else{
            System.out.println("Reprovado com média " + media );
        }
    }
}