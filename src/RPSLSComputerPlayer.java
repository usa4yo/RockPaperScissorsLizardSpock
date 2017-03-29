
public class RPSLSComputerPlayer {

    String name;
    int round;
    String move;
    
	/**
	 * @param name
	 * @param round
	 * @param move
	 */
    
	public RPSLSComputerPlayer(String name, int round, String move) {
		super();
		this.name = name;
		this.round = round;
		this.move = move;
	}	// Ending bracket of constructor RPSLSComputerComputer
	
	public RPSLSComputerPlayer(String name) {
		super();
		this.name = name;
	}	// Ending bracket of constructor RPSLSComputerComputer

	/**
	 * @return the computer
	 */
	public String getName() {
		return name;
	}	// Ending bracket of getName
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	// Ending bracket of setName
	
	/**
	 * @return the round
	 */
	public int getRound() {
		return round;
	}	// Ending bracket of getRound
	
	/**
	 * @param round the round to set
	 */
	public void setRound(int round) {
		this.round = round;
	}	//Ending bracket of setRound

    /**
     * @return the move
     */
    public String getMove() {
        return move;
    }   // End bracket of getMove

    /**
     * @param move the move to set
     */
    public void setMove(String move) {
        this.move = move;
    }   // End bracket of setMove
	
}	// Ending bracket of RPSLSComputerPlayer
