package topicosjava;

import java.util.Scanner;

public class CalcularMDC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("================================================");
		System.out.println("        Calcula o MDC entre 2 numeros           ");
		System.out.println("================================================");
		System.out.println("Digite o primeiro numero e em seguida um segundo");
		// int num1= MathChallenge(s.nextInt());
		// System.out.println("Digite o numero 2");
		// int num2= MathChallenge(s.nextInt());
		//int num1, num2;
		//MathChallenge (num1=s.nextInt(), num2=s.nextInt() );
		int num1,num2;
		MathChallenge (num1=s.nextInt(), num2=s.nextInt());
		while (num1 != num2) {
			if(num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}

		System.out.println("O MDC dos numeros é: "+MathChallenge (num1,num2));
		System.out.printf("o Maximo Divisor Comum dos numeros é: %d", num2);
	}

	public static int MathChallenge(int num1, int num2) {

		return  num1;
	}


}
