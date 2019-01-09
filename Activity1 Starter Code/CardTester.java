/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String suit = "six";
	    String rank = "four";
	    int pointValue = 5;
	    Card c = new Card(rank, suit, pointValue);
	    System.out.println(c);
	    suit = "red";
	    rank = "eight";
	    pointValue = 7;
	    Card d = new Card(suit, rank, pointValue);
	    System.out.println(d);
	    suit = "5";
	    rank = "7";
	    pointValue = 14;
	    Card e = new Card(rank, suit, pointValue);
	    System.out.println(e);
	}
}
