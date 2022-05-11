package javaipc;

import java.util.Scanner;

public class javaipc3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o raio do circulo: ");
		int r = teclado.nextInt();
		r = r*r;
		double pi = 3.14;
		System.out.print("A area do circulo é: " + (3.14 * r));

	}

}
