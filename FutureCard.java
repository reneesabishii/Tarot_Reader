/**
 * A derived class representing a FutureCard, extended from Card.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */
public class FutureCard extends Card {
	public String futFortune;

	/**
     * Returns a String that is the future fortune.
     * @return String futureFortune.
     */
	public String getDescription() {
		if(cardName.indexOf("Wands") != -1) {
			futFortune = "You will be passionate.";
              		if (cardName.indexOf("reversed") != -1) {
                  		futFortune = "You will not be passionate.";
              		}
          	}
          
        	else if(cardName.indexOf("Pentacles") != -1) {
              		futFortune = "You will be rich.";
              		if (cardName.indexOf("reversed") != -1) {
                  		futFortune = "You will not be rich.";
              		}
          	}

          	else if(cardName.indexOf("Swords") != -1) {
              		futFortune = "You will be conflicted.";
              		if (cardName.indexOf("reversed") != -1) {
                  		futFortune = "You will not be conflicted.";
              		}
          	}

          	else if(cardName.indexOf("Cups") != -1) {
              		futFortune = "You will be happy.";
              		if (cardName.indexOf("reversed") != -1) {
                  		futFortune = "You will not be happy.";
              		}
          	}
          
          	else {
			futFortune = "You will be " + cardName + ".";
              		if (cardName.indexOf("reversed") != -1) {
                  		futFortune = "You will not be " + cardName.replace(" reversed", ".");
              		}
          	}
          
      		return futFortune;
   	}
}
