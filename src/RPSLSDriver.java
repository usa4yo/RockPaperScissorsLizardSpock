import java.util.Scanner;

/**
 * 
 * Class        : RPSLSDriver
 * Project 8    : Rock-Paper-Scissor-Lizard-Spock game
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-24
 * Last Mod.    : 2017-03-24
 * Due Date     : 2017-03-28

 */

public class RPSLSDriver {

//    private RPSLSHumanPlayer player1;
//    private RPSLSHumanPlayer player2;        
//
//    private RPSLSComputerPlayer computer1;
//    private RPSLSComputerPlayer computer2;
	
    private static char playMode;
    
    private static final char OPTION_A                  = 'A';
    private static final char OPTION_B                  = 'B';
    private static final char OPTION_C                  = 'C';
    private static final char OPTION_X                  = 'X';    
    
    private static final String HUMAN_VS_HUMAN          = "      "+ OPTION_A + " - Human vs. Human";
    private static final String HUMAN_VS_COMPUTER       = "      "+ OPTION_B + " - Human vs. Computer";
    private static final String COMPUTER_VS_COMPUTER    = "      "+ OPTION_C + " - Computer vs. Computer";
    private static final String EXIT                    = "      "+ OPTION_X + " - To EXIT the game";
    
    private static final String REQUEST_WHAT_MODE_TO_PLAY = "Please select a mode?";
    private static final String NAME_OF_PLAYER = "What is the name of player ";
    private static final String NAME_OF_COMPUTER = "What is the name of the computer ";    
    private static final String OPTION_EXIT = "You have choosen to exit from the game. Please come back later... Aurevoir!";    
    private static final String INVALID_MODE = "This is an invalid selection. Please select between A, B, C or X to Exit";    
    
    public static void main(String[] args){

        String player;
        
        // Define keyboard as a scanner
        Scanner kb = new Scanner(System.in);
        
        RPSLSHumanPlayer player1;
        RPSLSHumanPlayer player2;        

        RPSLSComputerPlayer computer1;
        RPSLSComputerPlayer computer2;
        
        
        //*****************************************************************
        // Request the mode of play
        //  
        //  1. Human vs. Human
        //  2. Human vs. Computer
        //  3. Computer vs. Computer
        //  4. To EXIT the Game
        //*****************************************************************
        do {
            System.out.println();
            System.out.println(REQUEST_WHAT_MODE_TO_PLAY);
            System.out.println();
            System.out.println(HUMAN_VS_HUMAN);
            System.out.println(HUMAN_VS_COMPUTER);
            System.out.println(COMPUTER_VS_COMPUTER);
            System.out.println(EXIT);
      
            playMode = kb.nextLine().toUpperCase().charAt(0);;
    
           
            System.out.println("You have choosen : " + playMode);
            System.out.println();

            if(playMode == OPTION_A){
                System.out.println(NAME_OF_PLAYER + "1");
                player = kb.nextLine();
                player1 = new  RPSLSHumanPlayer(player);
                System.out.println(NAME_OF_PLAYER + "2");
                player = kb.nextLine();                
                player2 = new RPSLSHumanPlayer(player);
                optionHumanVsHuman(player1, player2);
                displayFinalScore();
            } else if(playMode == OPTION_B) {
                System.out.println(NAME_OF_PLAYER + "1");
                player = kb.nextLine();
                player1 = new RPSLSHumanPlayer(player);
                System.out.println(NAME_OF_COMPUTER + "1");
                player = kb.nextLine();                
                computer1 = new RPSLSComputerPlayer(player);
                optionHumanVsComputer(player1, computer1); 
                displayFinalScore();                
            } else if(playMode == OPTION_C) {
                System.out.println(NAME_OF_COMPUTER + "1");
                player = kb.nextLine();
                computer1 = new  RPSLSComputerPlayer(player);
                System.out.println(NAME_OF_COMPUTER + "2");
                player = kb.nextLine();                
                computer2 = new RPSLSComputerPlayer(player);
                optionComputerVsComputer(computer1, computer2);               
                displayFinalScore();
            } else if(playMode == OPTION_X) {
                playMode = OPTION_X;
                System.out.println(OPTION_EXIT);
            } else {
                System.out.println(INVALID_MODE);
            }   // Ending bracket of if statement
            
        } while (playMode != OPTION_X);
        
//        Player player1 = new Player(playerName);
        
        kb.close();
        
    }   // Ending bracket of main method

	private static void optionHumanVsHuman(RPSLSHumanPlayer player1, RPSLSHumanPlayer player2){
        System.out.println("Welcome " + player1.getHuman() + " and " + player2.getHuman());
        RPSLSGame player;
        
        for (int i = 1; i < 6; ++i) {
            player1.setTurn(i);
            player = new RPSLSGame(i);
            player1.setScore(0);
            System.out.println(player1.getHuman() + ", for your round " + player1.getTurn() + " you got: " + player1.getScore());
            player2.setTurn(i);
            player2.setScore(1);
            System.out.println(player2.getHuman() + ", for your round " + player2.getTurn() + " you got: " + player2.getScore());
            }
            
    }   // Ending bracket of displayHumanVsHuman method

    private static void optionHumanVsComputer(RPSLSHumanPlayer player1, RPSLSComputerPlayer computer1){
        System.out.println("Welcome " + player1.getHuman() + " and " + computer1.getComputer());
        for (int i = 0; i < 5; ++i) {
            System.out.println(player1 + ", for your round " + i + "you got: " + i);
            System.out.println(computer1 + ", for your round " + i + "you got: " + i);
        }
    
    }   // Ending bracket of optionHumanVsComputer method

    private static void optionComputerVsComputer(RPSLSComputerPlayer computer1, RPSLSComputerPlayer computer2){
        System.out.println("Welcome " + computer1.getComputer() + " and " + computer2.getComputer()); 
        for (int i = 0; i < 5; ++i) {
            System.out.println(computer1 + ", for your round " + i + "you got: " + i);
            System.out.println(computer2 + ", for your round " + i + "you got: " + i);
            }

    }   // Ending bracket of optionComputerVsComputer method


    private static void playGame(String playerA, String playerB){
        System.out.println();        
        System.out.println("Let's play!");
        System.out.println();

    }   // Ending bracket of playGame method
    
    
    private static void displayFinalScore(){
        System.out.println("TODO Execute Display the final score");
    }   // Ending bracket of displayFinalScore method
    
}   // Ending bracket of RPSLSDriver
