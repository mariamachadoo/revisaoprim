package javarevisao;

import java.util.ArrayList;
import java.util.Scanner;

public class positivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Informe números inteiros (digite '0' para finalizar):");
		
		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0 ) {
				break;
				
			}
			numeros.add(numero);
		}
		if (positivos(numeros)) {
			System.out.println("Todos os números informados são positivos");
			
		}else {
			System.out.println("Alguns números informados não são positivos");
		}

	}
	public static boolean positivos(ArrayList<Integer> numeros) {
		for (int numero : numeros) {
			if (numero <= 0) {
				return false;
			}
		}
		return true;
	}
}
