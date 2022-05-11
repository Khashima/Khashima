package javaipc;

import java.util.Scanner;

public class javaipc4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a temperatura desejada em Celsius: ");
		int C = teclado.nextInt();
		int K = C + 273;
		int F = (9 * C + 160) / 5;
		System.out.printf("%d Cº em Fahrenheit é: %d º\n%d Cº em Kelvin é: %d º", C, F, C, K);

	}

}
