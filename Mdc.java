import java.util.Scanner;

public class Mdc {


		 public static int MathChallenge(int num) {
			    // code goes here  
			    return num;
			  }

			  public static void main (String[] args) {  
			    // keep this function call here     
				  Scanner s = new Scanner(System.in);
				//  Integer v= MathChallenge(s.nextInt());
					
					 try {
						 System.out.println("Digite o numero 1");
						 Integer num1= MathChallenge(s.nextInt());
						 System.out.println("Digite o numero 2");
						 Integer num2= MathChallenge(s.nextInt());
						 
					        while (num1 != num2) {
					        	if(num1 > num2)
					                num1 = num1 - num2;
					            else
					                num2 = num2 - num1;
					        }
					        System.out.printf("GCD of given numbers is: %d", num2);
					} catch (Exception e) {
						e.printStackTrace();
					}
				        
				    }
	

}
