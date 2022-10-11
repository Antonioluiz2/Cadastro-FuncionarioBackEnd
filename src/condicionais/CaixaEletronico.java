package condicionais;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		double saldo=25.0;
		double valorSolicitado;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite o valor de Saque: ");
		valorSolicitado=sc.nextDouble();
		if(valorSolicitado<saldo) {
			saldo-=valorSolicitado;
			System.out.println("saque realizado!!!");
			System.out.println();
			System.out.println("Saldo Atual: "+saldo);
		}else {
			System.out.println("Saldo indisponivel");
			System.out.println("FIM DO PROGRAMA");
		}
		
	}

}
