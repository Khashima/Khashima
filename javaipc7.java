package javaipc;

import java.util.Scanner;

public class javaipc7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe por favor o valor de A: ");
		int A = teclado.nextInt();
		System.out.print("Informe por favor o valor de B: ");
		int B = teclado.nextInt();
		A = A^B;
		B = B^A;
		A = A^B;
		System.out.printf("A agora vale: %d e B agora vale: %d", A, B);

	}

}
