/**
 * A derived class representing a PastCard, extended from Card.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */
public class PastCard extends Card {
 	public String pastFortune;
   
   	/**
     * Returns a String that is the past fortune.
     * @return String pastFortune.
     */
    public String getDescription() {
        if(cardName.indexOf("Wands") != -1) {
			pastFortune = "You were passionate.";
            if (cardName.indexOf("reversed") != -1) {
                pastFortune = "You were not passionate.";
            }
        }
          
       	else if(cardName.indexOf("Pentacles") != -1) {
            pastFortune = "You were rich.";
            if (cardName.indexOf("reversed") != -1) {
                  pastFortune = "You were not rich.";
            }
        }

        else if(cardName.indexOf("Swords") != -1) {
            pastFortune = "You were conflicted.";
            if (cardName.indexOf("reversed") != -1) {
                pastFortune = "You were not conflicted.";
            }
        }

        else if(cardName.indexOf("Cups") != -1) {
            pastFortune = "You were happy.";
            if (cardName.indexOf("reversed") != -1) {
                  		pastFortune = "You were not happy.";
            }
        }
          
        else {pastFortune = "You were " + cardName + ".";
            if (cardName.indexOf("reversed") != -1) {
                pastFortune = "You were not " + cardName.replace(" reversed", ".");
            }
        }
          
		return pastFortune;
   	}
}
