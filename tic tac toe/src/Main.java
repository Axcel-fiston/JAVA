import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Rectangle cell = new Rectangle(100, 100);
                cell.setFill(Color.WHITE);
                cell.setStroke(Color.BLACK);
                int row = i;
                int col = j;
                cell.setOnMouseClicked(e -> {
                    if (isValidMove(row, col)) {
                        board[row][col] = currentPlayer;
                        drawMove(grid, row, col);
                        if (checkWinner()) {
                            showWinner(currentPlayer);
                            primaryStage.close();
                        } else if (isBoardFull()) {
                            showAlert("It's a draw!");
                            primaryStage.close();
                        } else {
                            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                        }
                    }
                });
                grid.add(cell, j, i);
            }
        }

        Scene scene = new Scene(grid, 330, 330);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isValidMove(int row, int col) {
        return board[row][col] == '\0';
    }

    private void drawMove(GridPane grid, int row, int col) {
        Rectangle cell = new Rectangle(100, 100);
        cell.setFill(Color.WHITE);
        cell.setStroke(Color.BLACK);
        char mark = board[row][col];
        if (mark == 'X') {
            cell.setStroke(Color.RED);
        } else {
            cell.setStroke(Color.BLUE);
        }
        grid.add(cell, col, row);
    }

    private boolean checkWinner() {
        // Implement your winning logic here
        return false;
    }

    private boolean isBoardFull() {
        // Implement your logic to check if the board is full
        return false;
    }

    private void showWinner(char player) {
        showAlert("Player " + player + " wins!");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
