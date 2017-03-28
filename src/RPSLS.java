

public enum RPSLS {
    Rock("Rock"), 
    Paper("Paper"),
    Scissors("Scissors"),
    Lizard("Lizard"),
    Spock("Spock");

    private final String move;

    public static RPSLS getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
    
    private RPSLS(String newMove){
        this.move = newMove;
    }   // Ending bracket of the constructor RPSLS

    /**
     * @return the move
     */
    public String getMove() {
        return move;
    }


}   // Ending bracket of enum RPSLS

