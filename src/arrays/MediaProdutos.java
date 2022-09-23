package arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		System.out.println("Entre com uma quantidade de produtos: ");
		int n=sc.nextInt();
		MediaPeodutoEntites[] vect=new MediaPeodutoEntites[n];

		for(int i=0; i<vect.length;i++) {
			sc.nextLine();
			String name=sc.nextLine();
			double price=sc.nextDouble();
			vect[i]=new MediaPeodutoEntites(name, price);
		}
		double soma=0.0;
		for(int i=0;i<vect.length;i++) {
			soma+=vect[i].getPrice();
		}
		double avg=soma/vect.length;
		System.out.println("A media de PREÇOS é: "+avg);
		sc.close();

	}

}
