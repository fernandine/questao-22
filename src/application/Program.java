package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		int maior = 0;
		int menor = 0;
		int soma = 0;
		double media = 0;

		for (int i = 0; i < 5; i++) {

			// Entrada da qtde de n�meros que vai repetir
			System.out.print("Entre com o n�mero : ");
			a[i] = sc.nextInt();

			// L�gica do maior e menor n�mero;
			if (a[i] > maior) {
				maior = a[i];
			} else if (a[i] < menor && a[i]!=0) {
				menor = a[i];
			} 
			
			//L�gica da m�dia;
			soma += a[i];
			media = soma / a[i];
			
		}
		
		if(menor == maior) {
			System.out.println("S�o iguais!");
		}
		
		System.out.println("o maior numero e: " + maior);
		System.out.println("Menor numero: " + menor);
		System.out.println("M�dia dos valores: " + media);

		sc.close();
	}
}
