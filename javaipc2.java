package javaipc;

import java.util.Scanner;

public class javaipc2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o tamanho do lado do quadrado: ");
		int l = teclado.nextInt();
		int res = l * l;
		System.out.printf("A area do quadrado é: %d", res);

	}

}
