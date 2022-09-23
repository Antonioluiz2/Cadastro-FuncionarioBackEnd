package topicosjava;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int soma=a+b+c;
		int higther=max(a,b,c);
		
		showResult(higther);
		somaTudo(soma);
	
	}

	

	public static int max(int x, int y, int z) {
		int aux;
		if(x>y && x>z){
			aux=x;
		}else if(y>z) {
			aux=y;
		}else {
			aux=z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O maior Numero é: "+ value);
	}
	public static void somaTudo(int value) {
		System.out.println("A Soma dos valores digitados: "+value);
	}
}
