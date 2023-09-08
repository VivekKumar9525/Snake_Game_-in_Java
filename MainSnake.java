import javax.swing.*;

public class MainSnake {
    public static void main(String[] args) throws Exception {
        int boardWidth = 500;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake Game");
        frame.setVisible(true);
	    frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}