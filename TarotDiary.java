import java.util.ArrayList; 
/**
 * A class representing an ArrayList of Tarot cards drawn.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */ 
public class TarotDiary {
	/**
     	 * The list of cards.
     	 */
	ArrayList<Card> myDiary = new ArrayList<>();
	
	/**
     	 * Constructor initializing ArrayList myDiary
     	 */
	public TarotDiary() {
      		myDiary = new ArrayList<>();
   	}
   
	/**
     	 * Adds object Card to array list.
     	 * @param card1, first Card of the reading
     	 * @param card2, second Card of the reading
	 * @param card3, third Card of the reading
     	 */
   	public void addCard(Card card1, Card card2, Card card3) {
        	myDiary.add(card1);
        	myDiary.add(card2);
        	myDiary.add(card3);
    	}
	/**
     	 * Prints the list of cards from myDiary ArrayList.
     	 */
    	public void printCards(){
		//If the ArrayList is empty.
        	if (myDiary.size() == 0) {
            		System.out.println();
            		System.out.println("No cards drawn yet.");
            		System.out.println();
            		TarotMenu.printMenu();
        	}
        	else {
            		int i;
            		System.out.println();
      			for (i = 0; i < myDiary.size(); ++i){
      				myDiary.get(i).printInfo();
      			}
      			System.out.println();
      			TarotMenu.printMenu();
    		}
	}
}
   
