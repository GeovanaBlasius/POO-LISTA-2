import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Informe a primeira nota : ");
        float nota1 = en.nextFloat();
        System.out.println("Informe a segunda nota : ");
        float nota2 = en.nextFloat();
        float media = (nota1 + nota2)/2;

        if(media >= 7 && media <= 10){
            System.out.println("APROVADO com média " + media);
        }else if (media >= 3 && media <= 6.9){
            System.out.println("EXAME com média " + media );
        }
        else if (media >= 0 && media < 3){
            System.out.println("Reprovado com média " + media );
        }
        else{
            System.out.println("Média Inválida !! ");
        }
    }
}