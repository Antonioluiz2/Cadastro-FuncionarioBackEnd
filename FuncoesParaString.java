package topicosjava;

public class FuncoesParaString {

	public static void main(String[] args) {
		String original="abcd EFGH ijlm NOPQ rstu VXZ ";
		
		String s01=original.toLowerCase();
		String s02=original.toUpperCase();
		String s03=original.trim();
		//substring quebra a string e cria uma nova, neste caso 2 equivale aos 2 primeiros caracteres 0 e 1
		String s04=original.substring(2);
		//com intervalo, tirando 2 caracter no e inicio e 9 no final
		String s05=original.substring(2,9);
		//Fara asubistituição de 'a' por 'X';
		String s06=original.replace('a','X');
		int s07=original.indexOf("j");
		int s08=original.lastIndexOf("PQ");
		
		
		System.out.println(original);
		System.out.println("toLowerCase:- "+ s01+"-");
		System.out.println("toUpperCase:- "+ s02+"-");
		//o trim elimita o espaço no final
		System.out.println("trim() :- "+ s03+"-");
		System.out.println("substring() :- "+ s04+"-");
		System.out.println("substring() :- "+ s05+"-");
		System.out.println("replace('a','X') :- "+ s06+"-");
		System.out.println("indexOf('ab') :- "+ s07+"-");
		System.out.println("lastIndexOf('pq') :- "+ s08+"-");
		
		System.out.println("==================================");
		System.out.println(" ");
		
		//operação split recorta a string e armazena em vetor[]
		String s="Batata Banana Maçã Limão";
		
		String[] vect=s.split(" ");
		String result=vect[0];
		String result1=vect[1];
		String result2=vect[2];
		String result3=vect[3];
		
		System.out.println("Resultado posição 0: "+result);
		System.out.println("Resultado posição 1: "+result1);
		System.out.println("Resultado posição 2: "+result2);
		System.out.println("Resultado posição 3: "+result3);
		
		
		String text="Hoje, não vai choje, apenas no sul vai garoá,10º";
		String[] d=text.split(",");
		String t=d[0];
		String t1=d[1];
		String t2=d[2];
		String t3=d[3];
		
		System.out.println(" ");
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Em santa Catarina faz: "+t3);
		
	}

}
