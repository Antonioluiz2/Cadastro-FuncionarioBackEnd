package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import list.ExercicioFuncionario;

public class ExerccicioFuncionarioApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		ExercicioFuncionario fu=new ExercicioFuncionario();
		List<ExercicioFuncionario>list= new ArrayList<>();

		//		List<Integer>id=new ArrayList<>();
		//		//Random g= new Random();
		//		List<String>func=new ArrayList<>();
		//		List<Double>sal=new ArrayList<>();
		int n1=1;


		System.out.println("Quantos Funcionarios deseja cadastrar?");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Funcionario #"+n1+++": ");
			System.out.print("ID: ");
			Integer id=sc.nextInt();
			while (pasId(list,id)) {
				System.out.println("O Id Ja existe, digite outro ID: ");
				System.out.print("ID: ");
				id=sc.nextInt();
			}
			System.out.print("NOME: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("SALARIO: ");
			Double sal=sc.nextDouble();

			ExercicioFuncionario func=new ExercicioFuncionario(id, name, sal);
			list.add(func);

		}
		System.out.println("Qual funcionario terá aumento? ");
		int idFun=sc.nextInt();

		Integer pos=hasId(list, idFun);
		if(pos==null) {
			System.out.println("Este ID não exite");
		}else {
			System.out.print("Entre com a porcentagem: ");
			double porcent=sc.nextDouble();
			list.get(pos).incrementoSalario(porcent);

		}
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (ExercicioFuncionario func : list) {
			System.out.println(func);
		}

		sc.close();
	}

	public static Integer hasId(List<ExercicioFuncionario>list1, int id) {
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	public static boolean pasId(List<ExercicioFuncionario>list, int id) {
		ExercicioFuncionario emp=list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return emp!=null;

	}
}
