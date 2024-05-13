/**
 * A derived class representing a PresentCard, extended from Card.
 * @author Renee Sevier
 * @version 0.1 2020/06/07
 */
public class PresentCard extends Card {
 	public String presFortune;

	/**
     * Returns a String that is the tense of the card and the present fortune.
     * @return String "You are" + presFortune.
     */
	public String getDescription() {
		if(cardName.indexOf("Wands") != -1){
			presFortune = "passionate";
              		if (cardName.indexOf("reversed") != -1) {
                  		presFortune = "not " + presFortune;
              		}
          	}
          
        	else if(cardName.indexOf("Pentacles") != -1){
              		presFortune = "rich.";
              		if (cardName.indexOf("reversed") != -1) {
                  		presFortune = "not " + presFortune;
              		}
          	}
		    else if(cardName.indexOf("Swords") != -1) {
              		presFortune = "conflicted.";
              		if (cardName.indexOf("reversed") != -1) {
                  		presFortune = "not " + presFortune;
              		}
          	}
          	else if(cardName.indexOf("Cups") != -1) {
              		presFortune = "happy.";
              		if (cardName.indexOf("reversed") != -1) {
                  		presFortune = "not " + presFortune;
              		}
          	}
          	else {
			presFortune = cardName + ".";
               		if (cardName.indexOf("reversed") != -1) {
                  		presFortune = "not " + cardName.replace(" reversed", ".");
              		}
          	}
          
      		return "You are " + presFortune;
   	}
}
