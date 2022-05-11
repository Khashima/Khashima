import java.util.Scanner;

public class Desafio1 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inv = 0; 
		System.out.println("Informe um numero para ser invertido: ");
		int inv0 = teclado.nextInt(); 

		while (inv0 > 0) { 
			inv *= 10; 
			inv += (inv0 % 10); 
			inv0 /= 10; 
		} 


		System.out.printf("O número invertido é: %d.\n", inv);

	}




}

