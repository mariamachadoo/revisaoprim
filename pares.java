package javarevisao;

import java.util.ArrayList;
import java.util.Scanner;

public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Digite números inteiros (digite '0' para finalizar):");
		
		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}
		System.out.println("Os números pares na lista são: ");
		NumerosPares(numeros);
	}
	public static void NumerosPares(ArrayList<Integer> numeros) {
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		}
	}
}
