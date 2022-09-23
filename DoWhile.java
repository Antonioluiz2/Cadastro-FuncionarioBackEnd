package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite a temperatura em celsius: ");
		
String resp1=sc.next();
		

		if(resp1.equalsIgnoreCase("S")) {
			System.out.print("Digite a temperatura em celsius: ");
			double C=sc.nextDouble();
			double F=9.0*C/5.0+32.0;
			double z=10*C;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
			System.out.println("Multiplicado : ("+C+" X "+"10) é igual: "+z);
			System.out.println("Deseja Repitir (S/N)? ");
			//resp=sc.next().charAt(0);
			resp1=sc.next();
		}else if(resp1.equalsIgnoreCase("N")){
			System.out.println("Voce escolheu sair do programa");
			System.out.print("fim do programa -> ");
			System.out.println("GoodBy!!");
			
		}else if(resp1.equalsIgnoreCase("")){
			System.out.println("Digite a letra S ou N");
			System.out.println("Deseja Repitir (S/N)? ");
			if(resp1.equalsIgnoreCase("S")) {
				do {
					System.out.print("Digite a temperatura em celsius: ");
					double C=sc.nextDouble();
					double F=9.0*C/5.0+32.0;
					double z=10*C;
					System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
					System.out.println("Multiplicado : ("+C+" X "+"10) é igual: "+z);
					System.out.println("Deseja Repitir (S/N)? ");
					resp1=sc.next();
				}while(resp1=="s");
				sc.close();
				System.out.println("fim do programa");
			}
			System.out.println("Click em Enter");
			
			}else {
				System.out.println("Finalizou tudo");
			}
			
	}

}
