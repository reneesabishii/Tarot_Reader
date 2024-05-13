import java.util.Scanner; import java.util.Random;/**
 * TarotMenu program for simulating a Tarot 3-card spread reading.
 * A card for the past, present, and future.
 * TarotMenu starts the program and gives the user choices for what to with their reading.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */ public class TarotMenu {
    /**
     * Prints the menu for the user to enter their choice.
     */
	public static void printMenu() {
    		System.out.println("MENU");
    		System.out.println("r - Enter r to randomly generate the 3 card spread.");
    		System.out.println("p - Enter 'p' to print all of the drawn cards.");
    		System.out.println("q - Quit");
    		System.out.println();
    		System.out.println("Choose an option:");
	}
	
 	/**
     * Asks for userInput based on the printMenu().
     * Uses this choice to draw three cards using Card's setCardNum(currCardNum) method.
     * User can draw 3 cards at a time multiple times.
     * Print fortunes from the Card's derived classes PastCard, PresentCard, FutureCard.
     * Cards added to class TarotDiary myDiary ArrayList.
     * User can print all cards that were drawn using TarotDiary's printCards() method.
     * @param args command-line arguments
	 * @see Card#setCardNum(int currCardNum)
	 * @see TarotDiary#printCards()
     */
	public static void main(String args[]) {
    		Scanner scnr = new Scanner(System.in);
    		TarotDiary reading = new TarotDiary();
    		printMenu();
		char userInput = scnr.next().charAt(0);
		Random randGen = new Random();
   		
		//userInput from printMenu().
		//Tested userInput q, p, r. Produced expected out put.
		//Tested border cases for userInput a, z, jjj, -1, 1000.
   		while (userInput != ' '){
        		if (userInput == 'q') {
        			System.out.println("See you next time!");
        			break;
        		}
       			//Generate 3 card spread.
       			if (userInput == 'r') {
	
				//PastCard
            			//Tests for numbers int currCardNum = 156, 0, -1, 1000, 155
            			int currCardNum = randGen.nextInt(155);
            			PastCard card1 = new PastCard();
            			card1.setCardNum(currCardNum);
            			System.out.print("PAST: ");
            			card1.printInfo();
       
				//PresentCard
				//Tests for numbers int currCardNum = 156, 0, -1, 1000, 155
            			currCardNum = randGen.nextInt(155);
            			PresentCard card2 = new PresentCard();
            			card2.setCardNum(currCardNum);
            			System.out.print("PRESENT: ");
            			card2.printInfo();
        
				//FutureCard
				//Tests for numbers int currCardNum = 156, 0, -1, 1000, 155
            			currCardNum = randGen.nextInt(155);
            			FutureCard card3 = new FutureCard();
            			card3.setCardNum(currCardNum);
            			System.out.print("FUTURE: ");
            			card3.printInfo();
        
				//Add reading (3 cards) to an ArrayList, myDiary.
        			reading.addCard(card1, card2, card3);
            			System.out.println();
            			//Print fortunes for 3 cards.
            			System.out.println(card1.getDescription());
            			System.out.println(card2.getDescription());
            			System.out.println(card3.getDescription());
            			System.out.println();
            			printMenu();
        		}
        		//Print all cards drawn from ArrayList, myDiary.
        		if (userInput == 'p') {
                		reading.printCards();
            			System.out.println();
        		}
      			//Invalid menu choices tested.
      			else if(userInput != 'q' && userInput != 'r' && userInput != 'p') {
        			System.out.println("Please enter one of these options:");
        			printMenu();
			}
        
    			userInput = scnr.next().charAt(0);
		}
    
	}
}
