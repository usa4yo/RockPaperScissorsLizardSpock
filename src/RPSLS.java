import java.awt.Color;

public enum RPSLS {
    Rock("Rock", Color.ORANGE), 
    Paper("Paper", Color.YELLOW),
    Scissors("Scissor", Color.MAGENTA),
    Lizard("Lizard", Color.GREEN),
    Spock("Spock", Color.BLUE);
    
    private final String code;
    private final Color color;
    
    private RPSLS(String newCode, Color newColor){
        this.code = newCode;
        this.color = newColor;
    }   // Ending bracket of the constructor RPSLS

    /**
     * @return the name
     */
    public String getCode() {
        return code;
    }   // Ending bracket of the getter getName

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }   // Ending bracket of the getter getColor

}   // Ending bracket of enum RPSLS
