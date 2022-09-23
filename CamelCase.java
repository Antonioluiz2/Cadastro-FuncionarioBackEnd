package camelCase;

import java.util.Scanner;

public class CamelCase {
	public static String StringChallenge(String str) {
	    // code goes here  
	    return str;
	  }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// String str1=sc.nextLine(); 
		 // System.out.println(StringChallenge(sc.nextLine().toLowerCase()));
		System.out.println("Digite a centeça:");
		String v= StringChallenge(sc.nextLine()); 
		 
		StringBuffer result = new StringBuffer(v.length());
		String strl = v.toLowerCase();
		boolean Capitalize = false;
		for (int i = 0; i < strl.length(); i++)
		{
		  char c = strl.charAt(i);
		  if (c >= 'a' && c <= 'z')
		  {
		    if (Capitalize)
		    {
		      result.append(strl.substring(i, i+1).toUpperCase());
		      Capitalize = false;
		    } else{
		      result.append(c);
		    }
		  } else {
		    Capitalize = true;
		  }
		}
		System.out.println("CamelCase de "+v+" é: "+result);
		
	}


}
