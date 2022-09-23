package arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		int n=sc.nextInt();
		
		double[] vect=new double[n]; 
		
		//percorrer o vetor
		for(int i=0; i<n;i++) {
			vect[i]=sc.nextDouble();
		}
		//somar os valores do vetor e colocar em uma varialvel soma
		double soma=0.0;
		for(int i=0;i<n;i++) {
			soma+=vect[i];
		}
		double avg=soma/n;
		System.out.println("A media de waltura é: "+avg);
		sc.close();
	}

}
