package javaipc;

import java.util.Scanner;

public class javaipc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a distancia em KM desejada: ");
		int km = teclado.nextInt();
		int res = km * 1000;
		System.out.printf("A distancia em metros é: %d", res);


	}

}
