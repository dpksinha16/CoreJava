
public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Numbers[]=new int[] {121,13,10,11,131};
		
		
		
		for (int i=0; i <Numbers.length; i++) {
		  int number=Numbers[i];
		  int ReversedNum=0;
		  int Temp=0;
		  
		  while(number >0) {
			  
			  Temp = number % 10;
			  number= number/10;
			  ReversedNum=ReversedNum * 10 + Temp;
			  
		  }
		   if(Numbers[i] == ReversedNum)
			   System.out.println(Numbers[i] + " is a palindrome number");
		   else 
			   System.out.println(Numbers[i] + " is not a palindrome number");
		}
	}
	
		  
		
		

	

}
