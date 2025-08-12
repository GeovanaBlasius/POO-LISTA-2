import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner en = new Scanner(System.in);
       System.out.print("Informe uma letra:");
       char letraOriginal = en.next().charAt(0); //guarda como foi informada
       char letra = Character.toLowerCase(letraOriginal); //copia minuscula para verificação no if abaixo

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " é uma vogal.");
        } else {
            System.out.println(letra + " não é uma vogal.");
        }
    }
}