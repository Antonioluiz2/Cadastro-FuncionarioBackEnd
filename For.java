package estruturaRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		//o for fara a contagem e somará os valores recebidos
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int n=sc.nextInt();
		int soma=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			soma=soma+x;
		}
		System.out.println(soma);

		//encrementando valor
		System.out.println("==============================");
		System.out.println("Digite outro valor: ");
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println("O valor de i: "+ i);
		}

		//decrementando o valor de um ponto especifico
		System.out.println("==============================");
		System.out.println("Digite outro valor: ");
		int c=sc.nextInt();
		for(int i=c;i>=0;i--) {

			//int x=sc.nextInt();
			System.out.println("O valor de i: "+ i);
		}
		System.out.println("==============================");
	}
}
