import java.io.IOException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args)throws IOException {
		Scanner num = new Scanner(System.in);
		int N = num.nextInt();
		
		for(int i = 1; i <= N ; i++){
		  if(i % 2 == 0)System.out.println(i);  
		}
	}
}