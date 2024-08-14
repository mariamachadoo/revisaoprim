package javarevisao;

import java.util.Scanner;

public class exerciciovendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int venda = ler.nextInt();
		int pri, seg, ter, quar;

		System.out.println("Informe o número de vendas na 1º semana");
		pri = ler.nextInt();

		System.out.println("Informe o número de vendas na 2º semana");
		seg = ler.nextInt();

		System.out.println("Informe o número de vendas na 3º semana");
		ter = ler.nextInt();

		System.out.println("Informe o número de vendas na 4º semana");
		quar = ler.nextInt();

		System.out.println("Voce vendeu" + pri+seg+ter+quar);

		switch (venda) {

		case 1:
            System.out.println("Você não tem bônus");
            break;
		case 2:
            System.out.println("Você não tem bônus");
            break;
		case 3:
            System.out.println("Você não tem bônus");
            break;
		case 4:
            System.out.println("Você não tem bônus");
            break;
		case 5:
            System.out.println("Você não tem bônus");
            break;
		case 6:
            System.out.println("Você não tem bônus");
            break;
		case 7:
            System.out.println("Você não tem bônus");
            break;
		case 8:
            System.out.println("Você não tem bônus");
            break;
		case 9:
            System.out.println("Você não tem bônus");
            break;
		case 10:
            System.out.println("Você tem um bônus de R$100,00");
            break;
		case 11:
            System.out.println("Você tem um bônus de R$100,00");
            break;
		case 12:
            System.out.println("Você tem um bônus de R$100,00");
            break;
		case 13:
            System.out.println("Você tem um bônus de R$100,00");
            break;
		case 14:
            System.out.println("Você tem um bônus de R$100,00");
            break;
		case 15:
            System.out.println("Você tem um bônus de R$300,00");
            break;
		case 16:
            System.out.println("Você tem um bônus de R$300,00");
            break;
		case 17:
            System.out.println("Você tem um bônus de R$300,00");
            break;
		case 18:
            System.out.println("Você tem um bônus de R$300,00");
            break;
		case 19:
            System.out.println("Você tem um bônus de R$300,00");
            break;
		case 20:
            System.out.println("Você tem um bônus de R$500,00");
            break;
		}
		ler.close();
	}
}

