
public class RPSLSComputerPlayer {
    String name;
    String winner;
	/**
	 * @param name
	 * @param winner
	 */
    
	public RPSLSComputerPlayer(String name, String winner) {
		super();
		this.name = name;
		this.winner = winner;
	}	// Ending bracket of constructor RPSLSComputerComputer
	
	public RPSLSComputerPlayer(String player) {
		super();
		this.name = player;
	}	// Ending bracket of constructor RPSLSComputerComputer

	/**
	 * @return the name
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
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}	// Ending bracket of getWinner
	
	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}	//Ending bracket of setWinner
	
}	// Ending bracket of RPSLSComputerPlayer
