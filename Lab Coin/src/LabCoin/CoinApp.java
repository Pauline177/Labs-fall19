package LabCoin;


public class CoinApp {
	
	public static void main(String[] args) {
		
//		Coin cent = Coin.CENT;
//		Coin nickel = Coin.NICKEL;
//		Coin dime = Coin.DIME;
//		Coin quarter = Coin.QUARTER;
		
		for (Coin c: Coin.values()) {
			
			System.out.println(c);
		}
		
//		System.out.println(Coin.CENT.toString());
		

	}	
}
