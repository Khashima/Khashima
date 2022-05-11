package javaipc;

import java.util.Scanner;

public class javaipc8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantas camisas foram lavadas? ");
		int cami = teclado.nextInt();
		System.out.print("Quantas calças foram lavadas? ");
		int calç = teclado.nextInt();
		System.out.print("Quantas meias foram lavadas? ");
		int meia = teclado.nextInt();
		int total = (cami * 5 + calç * 10 + meia * 2);
		System.out.printf("Você gastou: R$%d,00",total);
	}

}
