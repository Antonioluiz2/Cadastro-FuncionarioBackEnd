package fuction;

public class Funtion1 {

	public void Run() {
		dadosPessoais();
		System.out.println("====================");
		dados();
		System.out.println("====================");
		empresa();
		System.out.println("====================");
		dadosPessoais();


	}

	public static void dadosPessoais() {
		String name="Antonio Luiz";
		String endereco="Crato-CE";
		int idade=40;
		
		System.err.println("Nome: "+ name);
		System.err.println("Edereço: "+endereco);
		System.err.println("Idade: "+idade);
	}
	public static void dados() {
		String experiecia="Estacio";
		String escolaridade="Superior";
		boolean formado=true;
		
		System.err.println("Experiecia: "+ experiecia);
		System.err.println("Escolaridade: "+escolaridade);
		System.err.println("Formado: "+formado);
	}
	public static void empresa() {
		String empresaAtual="Sicoob";
		String endereco="Brasilia";
		int tempo=4;
		
		System.err.println("Empresa Atual: "+ empresaAtual);
		System.err.println("Edereço: "+endereco);
		System.err.println("Tempo em meses: "+tempo);
	}
}

