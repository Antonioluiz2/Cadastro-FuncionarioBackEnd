package arrays;

public class ForEach {

	public static void main(String[] args) {
		int n=10;
		String[] name= new String[] {"Luiz", "Geisy","Rafa"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("--------------");
		 
		 for (String luk : name) {
			// System.out.println(luk);
			 System.out.println(n+++": "+luk);
		}
	}
}
