import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        // Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = ( A * 3.5 +  B * 7.5)/11; 

        // Complete com a variável que representa o resultado da média.
        System.out.printf("MEDIA = %.5f", media );
        System.out.println();
    }
}