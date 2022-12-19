package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;
        GameService gameService = new GameService();
        gameService.showMenu();
        computerChoice = gameService.generateComputerChoice( random );
        userChoice = gameService.getUserChoice( scanner );
        gameService.chooseWinner( computerChoice, userChoice );
    }
}