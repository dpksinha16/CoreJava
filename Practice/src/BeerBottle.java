
public class BeerBottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int BeerBottle=99;
		String word="bottles";
		
		while(BeerBottle >0) {
			
			if (BeerBottle== 1) {
				word= "bottle";
		}
			System.out.println(BeerBottle +"" + word +"on the wall");
			System.out.println(BeerBottle +"" + word );
			System.out.println("Pass it on");
			System.out.println("Take one down");
			BeerBottle=BeerBottle-1;
			if (BeerBottle >0) {
				System.out.println(BeerBottle +"" + word +"on the wall");
			}else
				System.out.println("no more bottle is on the wall");
			
	}

	}
}
