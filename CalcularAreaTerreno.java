package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class CalcularAreaTerreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o Cumprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		}


}
