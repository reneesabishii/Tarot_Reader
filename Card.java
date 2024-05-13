/**
 * A class representing a Tarot card, determined from the number generated in class TarotMenu main() method.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */
public class Card {
	/**
     * The randomly generated number to find the name of the card.
     */
     //Tests for numbers int currCardNum = 156, 0, -1, 1000, 155
   	public int cardNum;
	/**
     * The name of the Tarot card.
     */
    public String cardName;
	
	/**
     * Default constructor initializing all fields to 0. 
     */   
    public Card() { 
    	cardNum = 0;   
    	cardName = "none";
	}

	/**
     * Constructor initializing cardNum to currCardNum.
     * @param currCardNum
     */   
	public Card (int currCardNum) {
    	cardNum = currCardNum;
 	}
 
	/**
     * Sets the cardNum to currCardNum.
     * @param currCardNum
     */  
 	public void setCardNum(int currCardNum){
      	cardNum = currCardNum;
 	}
 	
	/**
     * Returns the number of the card.
     * @return int value cardNum.
     */	
 	public int getCardNum() {
      	return cardNum;
 	}

	/**
     * Returns the name of the card.
     * @return String cardName.
     */
     
	public String getCardName(int cardNum) {
		//Major Arcana
    	if (cardNum == 0){
        	cardName = "The Fool";
    	}
    	if (cardNum == 1) {
        	cardName = "The Magician";
    	}
    	if (cardNum == 2) {
    		cardName = "The High Priestess";
    	}
    	if (cardNum == 3) {
    		cardName = "The Empress";
    	}
    	if (cardNum == 4) {
    		cardName = "The Emperor";
    	}
		if (cardNum == 5) {
			cardName = "The Hierophant";
		}
		if (cardNum == 6) {
			cardName = "The Lovers";
		}
		if (cardNum == 7) {
			cardName = "The Chariot";
		}
		if (cardNum == 8) {
			cardName = "Strength";
		}
		if (cardNum == 9) {
			cardName = "The Hermit";
		}
		if (cardNum == 10) {
			cardName = "The Wheel of Fortune";
		}
		if (cardNum == 11) {
			cardName = "Justice";
		}
		if (cardNum == 12) {
			cardName = "The Hanged Man";
		}
		if (cardNum == 13) {
			cardName = "Death";
		}
		if (cardNum == 14) {
			cardName = "Temperance";
		}
		if (cardNum == 15) {
			cardName = "The Devil";
		}			
		if (cardNum == 16) {
			cardName = "The Tower";
		}
		if (cardNum == 17) {
			cardName = "The Star";
		}
		if (cardNum == 18) {
			cardName = "The Moon";
		}
		if (cardNum == 19) {
			cardName = "The Sun";
		}
		if (cardNum == 20) {
			cardName = "Judgment";
		}
		if (cardNum == 21) {
			cardName = "The World";
		}

		//Wands
		if(cardNum > 21 && cardNum < 36) {
        		if(cardNum == 22) {
				cardName = "The Ace of Wands";
			}
        		else {
				cardNum = cardNum - 21;
            			if (cardNum == 11) {
					cardName = "The Page of Wands";
				}
            			else if (cardNum == 12) {
					cardName = "The Knight of Wands";
				}
            			else if (cardNum == 13) {
					cardName = "The Queen of Wands";
				}
            			else if (cardNum == 14) {
					cardName = "The King of Wands";
				}
            			else {
					cardName = Integer.toString(cardNum) + " of Wands";
				}
			}
		}

		//Cups
		if(cardNum > 35 && cardNum < 50) {
        		if(cardNum == 36) {
				cardName = "The Ace of Cups";
			}
        		else {
				cardNum = cardNum - 35;
            			if (cardNum == 11) {
					cardName = "The Page of Cups";
				}
            			else if (cardNum == 12) {
					cardName = "The Knight of Cups";
				}
            			else if (cardNum == 13) {	
					cardName = "The Queen of Cups";
				}
            			else if (cardNum == 14) {
					cardName = "The King of Cups";
				}
            			else {
					cardName = Integer.toString(cardNum) + " of Cups";
				}
			}
		}

		//Swords
		if (cardNum > 49 && cardNum < 64) {
    			if(cardNum == 50) {
				cardName = "The Ace of Swords";
			}
    			else {
				cardNum = cardNum - 49;
        			if (cardNum == 11) {
					cardName = "The Page of Swords";
				}
       				else if (cardNum == 12) {
					cardName = "The Knight of Swords";
				}
       				else if (cardNum == 13) {
					cardName = "The Queen of Swords";
				}
      				else if (cardNum == 14) {
					cardName = "The King of Swords";
				}
        			else {
					cardName = Integer.toString(cardNum) + " of Swords";
				}
			}
		}

		//Pentacles
    		if (cardNum > 63 && cardNum < 78) {
        		if(cardNum == 64) {
				cardName = "The Ace of Pentacles";
			}
        		else {
				cardNum = cardNum - 63;
                		if (cardNum == 11) {
					cardName = "The Page of Pentacles";
				}
                		else if (cardNum == 12) {
					cardName = "The Knight of Pentacles";
				}
                		else if (cardNum == 13) {
					cardName = "The Queen of Pentacles";
				}
                		else if (cardNum == 14) {
					cardName = "The King of Pentacles";
				}
                
                		else {
					cardName = Integer.toString(cardNum) + " of Pentacles";
				}
            		}
        
            	}

		//Reversed card.
		else if (cardNum > 77) {
			cardNum = cardNum - 78;
			cardName = getCardName(cardNum) + " reversed";}


	return cardName;
	}
	
	/**
	 * Prints the name of the card.
	 */
	public void printInfo(){
   	System.out.println(getCardName(cardNum));
   
	}
}
