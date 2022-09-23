package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class List1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List<String> name=new ArrayList<>();
		System.out.println("Qauntos nomes: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Digite o Nome: ");
			name.add(sc.next());
			//System.out.println(name);
		}
		System.out.println("Tamanho da lista: "+name.size());		
		System.out.println(name);
		System.out.println("-----------------------");
		//Busca objeto na lista
		System.out.println("Tamanho da lista: "+name.size());
		System.out.println("A posição : "+name.indexOf("Luiz"));
		System.out.println("Na posição 1, temos o valor: "+name.get(1));
		System.out.println("-----------------------");
		//adiciona na posição -valor
		name.add(2, "Rafa");
		System.out.println("Tamanho da lista: "+name.size());
		System.out.println(name);
		System.out.println("-----------------------");
		//removendo posição
		name.remove(0);
		System.out.println("Tamanho da lista: "+name.size());
		System.out.println(name);
		//Lista nomes começando com M maiusculo
		List<String>result=name.stream().filter(x->x.charAt(0)=='M').collect(Collectors.toList());
		System.out.println(result);
		System.out.println("-----------------------");
		
		//Remover todos que comece com 'M' maiusculo
		name.removeIf(x -> x.charAt(0)=='M');
		System.out.println("Tamanho da lista: "+name.size());
		System.out.println(name);
		System.out.println("-----------------------");
		//Lista nomes começando com A maiusculo
		List<String>result1=name.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
		System.out.println(result1);
		System.out.println("-----------------------");
		//Busca por filtro 1º nome começando com a letra 'P' no exemplo a baixo
		String nomeString=name.stream().filter(x->x.charAt(0)=='P').findFirst().orElse(null);
		System.out.println(nomeString);
		sc.close();
	}


}
