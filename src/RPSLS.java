
/**
 * 
 * Class        : RPSLS 
 * Project 8    : Rock-Paper-Scissor-Lizard-Spock game
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-24
 * Last Mod.    : 2017-03-29
 * Due Date     : 2017-03-30
 *
 */

public enum RPSLS {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),
    LIZARD("Lizard"),
    SPOCK("Spock");
    
    private String move;
  
   
    public static RPSLS getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }   // Ending bracket of getRandom move
    
    private RPSLS(String newMove){
        this.move = newMove;
    }   // Ending bracket of constructor Rpsls

    /**
     * @return the name
     */
    public String getMove() {
        return move;
    }   // Ending Bracket of getName

    public static int EvaluateResult(RPSLS a, RPSLS b) {
        //if a beats b, return 1
        //if a ties b, return 0
        //if b beats a, return -1

        int returnValue = -1;
        
        if(a == b) return 0;
        
        switch(a){
            case ROCK:
                if(b == LIZARD || b == SCISSORS){
                    returnValue = 1;
                }   // Ending bracket of if statement
                break;
            case PAPER:
                if(b == SPOCK || b == ROCK){
                    returnValue = 1;
                }   // Ending bracket of if statement
                break;
            case SCISSORS:
                if(b == PAPER || b == LIZARD){
                    returnValue = 1;
                }   // Ending bracket of if statement
                break;
            case LIZARD:
                if(b == SPOCK || b == PAPER){
                    returnValue = 1;
                }   // Ending bracket of if statement
                break;
            case SPOCK:
                if(b == SCISSORS || b == ROCK){
                    returnValue = 1;
                }   // Ending bracket of if statement
                break;
                
        }   // Ending bracket of switch
        
        return returnValue;
        
    }   // Ending bracket of compareTo class
    
}   // Ending Bracket of RPSLS class