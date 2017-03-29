import java.util.Scanner;

/**
 * 
 * Class        : RPSLSDriver
 * Project 8    : Rock-Paper-Scissor-Lizard-Spock game
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-24
 * Last Mod.    : 2017-03-30
 * Due Date     : 2017-03-30

 */

public class RPSLSDriver {

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
                optionPlayGame(player1, player2);
            } else if(playMode == OPTION_B) {
                System.out.println(NAME_OF_PLAYER + "1");
                player = kb.nextLine();
                player1 = new RPSLSHumanPlayer(player);
                System.out.println(NAME_OF_COMPUTER + "1");
                player = kb.nextLine();                
                player2 = new RPSLSHumanPlayer(player);
                optionPlayGame(player1, player2); 
            } else if(playMode == OPTION_C) {
                System.out.println(NAME_OF_COMPUTER + "1");
                player = kb.nextLine();
                player1 = new  RPSLSHumanPlayer(player);
                System.out.println(NAME_OF_COMPUTER + "2");
                player = kb.nextLine();                
                player2 = new RPSLSHumanPlayer(player);
                optionPlayGame(player1, player2);               
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

	private static void optionPlayGame(RPSLSHumanPlayer player1, RPSLSHumanPlayer player2){
        System.out.println("Welcome " + player1.getName() + " and " + player2.getName());
        System.out.println();
        
        int result;
        int totalPlayer1 = 0;
        int totalPlayer2 = 0;
        
        for (int i = 1; i < 6; ++i) {
            player1.setRound(i);
            player1.setMove(RPSLS.getRandom());
            player2.setRound(i);
            player2.setMove(RPSLS.getRandom());            
            result = RPSLS.EvaluateResult(player1.getMove(), player2.getMove());

            if (result == 0){
                player1.setScore(result);
                player2.setScore(result);
            } else if (result == 1) {
                player1.setScore(result);
                player2.setScore(0);
            } else {
                player1.setScore(0);
                player2.setScore(result);
                
            }   // Ending bracket of If statement

            totalPlayer1 = totalPlayer1 + player1.getScore();
            totalPlayer2 = totalPlayer2 + Math.abs(player2.getScore());
            
            System.out.println(player1.getName() + ", for your round " + player1.getRound() + " you got: " + player1.getMove() + " you score " + player1.getScore());
            System.out.println(player2.getName() + ", for your round " + player2.getRound() + " you got: " + player2.getMove() + " you score " + Math.abs(player2.getScore()));
            System.out.println();
            
        }   // Ending bracket of for loop

        if (totalPlayer1 == totalPlayer2){
            System.out.println("Congratulation to you " + player1.getName() + " and " + player2.getName() + " , you have tied!");
        } else if (totalPlayer1 > totalPlayer2){
            System.out.println("Congratulation to " + player1.getName() + " you have won " + totalPlayer1 + " to " + totalPlayer2);
        } else {
            System.out.println("Congratulation to " + player2.getName() + " you have won " + totalPlayer2 + " to " + totalPlayer1);
        }   // Ending bracket of if Statement
        
    }   // Ending bracket of displayHumanVsHuman method

}   // Ending bracket of RPSLSDriver
