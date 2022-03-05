import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	//Escreva aqui a sua lógica
    	double C = (((B - A) * 100) / A);
    	 System.out.printf("%.2f%%\n",C);
      leitor.close();
    }
	
}