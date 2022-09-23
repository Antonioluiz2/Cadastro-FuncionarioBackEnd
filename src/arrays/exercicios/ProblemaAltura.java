package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

import arrays.exercicios.entities.Pessoa;

public class ProblemaAltura {
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		//Pessoa ps = null;//new Pessoa();

		System.out.println("quantas pessoas deseja cadastrar?");
		int n=sc.nextInt();
		int nmenor=0;
		double alturaTotal=0, alturaMedia, percentualMenor;
		String nomes[]=new String[n];
		int idade[]=new int[n];
		double alt[]=new double[n];


		for(int i=0;i<n;i++) {
			System.out.printf("Dados da"+(i+1)+ "a pessoa:\n", i + 1);
			System.out.println("Digite o nome da pessoa");
			nomes[i]=sc.next();
			System.out.println("Digite a idade: ");
			idade[i]=sc.nextInt();
			System.out.println("Digite a altura: ");
			alt[i]=sc.nextDouble();
			
		}
		for(int i=0;i<n;i++) {
			if(idade[i]<16) {
				nmenor++;
			}
			alturaTotal+=alt[i];
		}
		//calcular a media da altura
		alturaMedia=alturaTotal/n;
		//calcular o percentual dos menores de 16
		percentualMenor=((double)nmenor/n)*100;
		
		 System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenor);

		    //vai popular os menores de 16 e listar os nomes
		for(int i=0;i<n;i++) {
			if(idade[i]<16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		
		sc.close();
	}


}
