package org.example;
import org.example.exception.WrongChoiceException;

import java.util.*;

public class GameService {
    private static final ArrayList<String> choices = new ArrayList<String>(Arrays.asList("rock", "paper", "scissors"));

    //Function to generate the computer choice
    public static String generateComputerChoice( Random  random){
        int wordNumber;
        wordNumber = random.nextInt( 3 );
        String computerChoice = choices.get(wordNumber);
        System.out.println( "\nThe Computer already made it's choice" );
        return computerChoice;
    }

    //Function to generate the user choice with exception handling
    public static String getUserChoice( Scanner scanner ) throws WrongChoiceException{
        String userWordChoice = "";
        System.out.print( "\nPlease make yours : " );
        userWordChoice = scanner.nextLine();
        if (!choices.contains(userWordChoice)) {
            throw new WrongChoiceException("You have typed the wrong name");
        }
        //Returning the user choice
        return userWordChoice;
    }

    //Function to show the list of available options
    public static void showMenu(){
        System.out.println( "Options to choose from(Please Type whole string) :\nrock\npaper\nscissors" );
    }
    // Choose winner
    public static String chooseWinner( String computerChoice, String userChoice ){
        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockCustomMessage = "The rock smashes the scissor";
        String scissorsCustomMessage = "Scissors cuts paper";
        String paperCustomMessage = "Paper wraps rock";

        //Winner Logic for the game start

        if( computerChoice.equals( "rock" ) && userChoice.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer";
            customMessage = rockCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "rock" ) && computerChoice.equals( "scissors" ) ){
            winner = "User";
            customMessage = rockCustomMessage;
        }

        if( computerChoice.equals( "scissors" ) && userChoice.equalsIgnoreCase( "paper" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "paper" ) ){
            winner = "User";
            customMessage = scissorsCustomMessage;
        }

        if( computerChoice.equals( "paper" ) && userChoice.equalsIgnoreCase( "rock" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "rock" ) ){
            winner = "User";
            customMessage = paperCustomMessage;
        }

        finalMessage = winner + " won ( " + customMessage + " )";
        System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
        System.out.println( finalMessage );
        return winner;
    }

}
