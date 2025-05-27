package RockPaperScissors;

import java.util.Random;

public class RockPaperScissor {
    public static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    private String computerChoice;
    private int ComputerScore, PlayerScore;
    private Random random;

    public RockPaperScissor() {
        random = new Random();
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return ComputerScore;
    }

    public int getPlayerScore() {
        return PlayerScore;
    }

    public String playRockPaperScissor(String playerChoice) {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];
        String result;

        if (playerChoice.equals(computerChoice)) {
            result = "Draw";
        } else if (
                (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                        (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                        (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
        ) {
            result = "Player Wins";
            PlayerScore++;
        } else {
            result = "Computer Wins";
            ComputerScore++;
        }

        return result;
    }
}

