
public class RPSLSComputerPlayer {

    String computer;
    int turn;
    int score;
    
	/**
	 * @param computer
	 * @param turn
	 * @param score
	 */
    
	public RPSLSComputerPlayer(String player, int round, int count) {
		super();
		this.computer = player;
		this.turn = round;
		this.score = count;
	}	// Ending bracket of constructor RPSLSComputerComputer
	
	public RPSLSComputerPlayer(String player) {
		super();
		this.computer = player;
	}	// Ending bracket of constructor RPSLSComputerComputer

	/**
	 * @return the computer
	 */
	public String getComputer() {
		return computer;
	}	// Ending bracket of getName
	
	/**
	 * @param name the name to set
	 */
	public void setComputer(String player) {
		this.computer = player;
	}	// Ending bracket of setName
	
	/**
	 * @return the turn
	 */
	public int getTurn() {
		return turn;
	}	// Ending bracket of getWinner
	
	/**
	 * @param winner the winner to set
	 */
	public void setTurn(int round) {
		this.turn = round;
	}	//Ending bracket of setWinner

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }   // End bracket of getScore

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }   // End bracket of setScore
	
}	// Ending bracket of RPSLSComputerPlayer
