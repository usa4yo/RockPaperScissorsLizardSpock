

public class RPSLSHumanPlayer {

    /**
     * @param human
     * @param turn
     * @param score
     */
    
    String human;
    int turn;
    int score;
    
    public RPSLSHumanPlayer(String player, int round, int count) {
        super();
        this.human = player;
        this.turn = round;
        this.score = count;
    }   // Ending bracket of constructor RPSLSHumanPlayer

    public RPSLSHumanPlayer(String player) {
        this.human = player;
    }   // Ending bracket of constructor RPSLSHumanPlayer

    /**
     * @return the human
     */
    public String getHuman() {
        return human;
    }

    /**
     * @param human the human to set
     */
    public void setHuman(String human) {
        this.human = human;
    }

    /**
     * @return the turn
     */
    public int getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(int turn) {
        this.turn = turn;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
    
}	// Ending bracket of RPSLSHumanPlayer
