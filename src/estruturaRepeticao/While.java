package estruturaRepeticao;


public class While {

	public static void main(String[] args) {
		int n=30;
		int soma=0;
		while(n!=0) {
			//se colocar o n-- será lançado apenas os numeros Impares ate valor de N.
			//n--;
			
			//somando os valores acumulando na variavel soma
			soma = soma+n;
			//soma+=n;
			//se não colocar o n--, deixando apenas o sysout n-- haverá contagem regressiva ate n=0.
			System.out.println(n--);
		}
		System.out.println(soma);
		//System.out.println(n);
	
	}	
		 
}