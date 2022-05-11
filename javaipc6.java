package javaipc;

import java.util.Scanner;

public class javaipc6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o comprimento da caixa d'agua: ");
		int comp = teclado.nextInt();
		System.out.print("Informe a largura da caixa d'agua: ");
		int larg = teclado.nextInt();
		System.out.print("Informe a altura da caixa d'agua: ");
		int alt = teclado.nextInt();

		System.out.println("O volume em litros q cabe na sua caixa d'agua é de: " + (comp * larg * alt * 1000));


	}

}
