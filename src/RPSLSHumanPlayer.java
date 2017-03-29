
/**
 * 
 * Class        : RPSLSHumanPlayer
 * Project 8    : Rock-Paper-Scissor-Lizard-Spock game
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-24
 * Last Mod.    : 2017-03-29
 * Due Date     : 2017-03-30
 *
 */

public class RPSLSHumanPlayer {

    /**
     * @param name
     * @param round
     * @param move
     * @param Score
     */
    
    String name;
    int round;
    int score;

    RPSLS move;
    
    public RPSLSHumanPlayer(String player, int round, RPSLS move, int score) {
        super();
        this.name = player;
        this.round = round;
        this.move = move;
        this.score = score;
    }   // Ending bracket of constructor RPSLSHumanPlayer

    public RPSLSHumanPlayer(String player) {
        this.name = player;
    }   // Ending bracket of constructor RPSLSHumanPlayer

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }   // Ending bracket of getName

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }   // Ending bracket of setName

    /**
     * @return the turn
     */
    public int getRound() {
        return round;
    }   // Ending bracket of getTurn

    /**
     * @param turn the turn to set
     */
    public void setRound(int turn) {
        this.round = turn;
    }   // Ending bracket of setTurn

    /**
     * @return the move
     */
    public RPSLS getMove() {
        return move;
    }   // Ending bracket of getScore

    /**
     * @param move the move to set
     */
    public void setMove(RPSLS move) {
        this.move = move;
    }   // Ending bracket of setScore

    /**
     * @return the Score
     */
    public int getScore() {
        return score;
    }   // Ending bracket of getScore

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }   // Ending bracket of setTurn
    
}   // Ending bracket of RPSLSHumanPlayer
