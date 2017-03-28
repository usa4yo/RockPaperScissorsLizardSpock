

public class RPSLSHumanPlayer {

    String name;
    String winner;
	/**
	 * @param name
	 * @param winner
	 */
	public RPSLSHumanPlayer(String player, String winner) {
		super();
		this.name = player;
		this.winner = winner;
	}	// Ending bracket of constructor RPSLSHumanPlayer
	
	public RPSLSHumanPlayer(String player) {
		this.name = player;
	}	// Ending bracket of constructor RPSLSHumanPlayer

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
	}	// Ending bracket of setWinner
    
        
}	// Ending bracket of RPSLSHumanPlayer
