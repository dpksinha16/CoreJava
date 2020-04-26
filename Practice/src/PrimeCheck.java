
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime check between 1 and 100
		for(int i=1; i<100; i++) {
			System.out.println("vaalue of i " + i);
			 boolean isPrime=true;
			 
			 for(int j=2 ; j<i; j++) {
				 System.out.println("vaalue of j" + j);
				 if(i % j==0) {
					 isPrime=false;
					 break;
					 
				 }
				 
				 
			 }
			 
			if(isPrime)
				System.out.println(i + " is  a prime number");
		}

	}

}
