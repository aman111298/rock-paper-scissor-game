package org.example.test;
import org.example.GameService;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;

public class GameServiceTester {
    GameService gameService;
    @BeforeEach
    void setup() {
        gameService= new GameService();
    }

    @Test
    public void test_chooseWinner() {
        String computerChoice1 = "rock";
        String userChoice1 = "paper";
        assertEquals("User", gameService.chooseWinner(computerChoice1,userChoice1));

        String computerChoice2 = "paper";
        String userChoice2 = "rock";
        assertEquals("Computer", gameService.chooseWinner(computerChoice2,userChoice2));
    }
}
