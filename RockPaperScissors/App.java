package RockPaperScissors;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RockPaperScissorsGui rockPaperScissorsGui =new RockPaperScissorsGui();
                //
                rockPaperScissorsGui.setVisible(true);
            }
        });
    }
}
