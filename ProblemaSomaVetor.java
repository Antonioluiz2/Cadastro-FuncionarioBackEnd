package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Quantos numeros deseja digitar? ");
		
		int n=sc.nextInt();
		int[] vect=new int[n];
		double soma = 0.0;
		double media = 0.0;

	    for (int i=0; i<vect.length; i++) {
	    	System.out.print("Digite um numero: ");
	        vect[i] = sc.nextInt();
	        soma+=vect[i];
	        media=soma/vect.length;
	        
	    }
	    System.out.println();
	    System.out.print("Valores= ");
	    for(int i=0;i<vect.length;i++) {
	    	 System.out.print(" "+vect[i]);
	    }
	    
	    System.out.println();
	    System.out.println("SOMA= "+soma);
	    System.out.println("MEDIA= "+media);
	}

}
