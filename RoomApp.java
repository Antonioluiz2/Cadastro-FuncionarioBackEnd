package application;

import java.util.Locale;
import java.util.Scanner;

import entites.aluguelRooms.AluguelRent;

public class RoomApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		AluguelRent[] vect=new AluguelRent[10];
		
		System.out.println("Quantas Sala deseja alugar? ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Alugue #" +i+ ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Email: ");
			String email=sc.next();
			System.out.print("Sala: ");
			int salaNumero=sc.nextInt();

			vect[salaNumero]=new AluguelRent(name, email);
		}
		System.out.println();
		System.out.println("As Salas alugadas foram: ");
		for(int i=0;i<10;i++) {
			if(vect[i]!=null) {
				System.out.println(i+": "+vect[i]);
			}
			sc.close();
		}
	}

}
