package javaipc;

import java.util.Scanner;

public class javaipc9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor em dinheiro desejado ");
		int money = teclado.nextInt();
		int cem = money / 100;
		int cinquenta = money / 50;
		int vinte = money / 20;
		int dez = money / 10;
		int cinco = money / 5;
		int dois = money / 2;
		int um = money / 1;
	
		System.out.printf("quantia de notas de 100: %d\n "
			       + "quantia de notas de 50: %d \n " 
	               + "quantia de notas de 20: %d \n " 
	               + "quantia de notas de 10: %d \n " 
	               + "quantia de notas de 5: %d \n " 
	               + "quantia de notas de dois: %d \n " 
	               + "quantia de moedas de 1: %d",cem,cinquenta,vinte,dez,cinco,dois,um);

	}

}
