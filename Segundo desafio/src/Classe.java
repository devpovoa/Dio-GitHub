import java.util.Scanner; 

public class Classe{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double
    double area, A;
    A = scan.nextDouble();
                  //continue a solucao

		area = 3.14159 * (Math.pow( A ,2));

		System.out.printf("A=%.4f\n", area);
	}
}