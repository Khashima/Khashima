package javaipc;

import java.util.Scanner;

public class javaipc5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int n = teclado.nextInt();
		System.out.printf("Seu antecessor é: %d, e seu sucessor é: %d", (n-1), (n+1));
	}

}
