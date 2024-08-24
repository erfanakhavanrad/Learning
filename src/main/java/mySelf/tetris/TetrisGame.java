package mySelf.tetris;

import java.util.Random;
import java.util.Scanner;

public class TetrisGame {
    private static final int BOARD_WIDTH = 5;
    private static final int BOARD_HEIGHT = 20;
    private static final int SHAPE_COUNT = 7;
    private static final char EMPTY_BLOCK = '.';
    private static final char FILLED_BLOCK = 'X';

    private char[][] board;
    private Random random;
    private int currentRow, currentCol;
    private char currentShape;

    public TetrisGame() {
        board = new char[BOARD_HEIGHT][BOARD_WIDTH];
        random = new Random();
        currentRow = 0;
        currentCol = BOARD_WIDTH / 2;
        currentShape = generateRandomShape();
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                board[i][j] = EMPTY_BLOCK;
            }
        }
    }

    private char generateRandomShape() {
        char[] shapes = {'I', 'J', 'L', 'O', 'S', 'T', 'Z'};
        return shapes[random.nextInt(SHAPE_COUNT)];
    }

    private void displayBoard() {
        char[][] tempBoard = new char[BOARD_HEIGHT][BOARD_WIDTH];
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                tempBoard[i][j] = board[i][j];
            }
        }
        // Place the falling shape on the temporary board
        switch (currentShape) {
            case 'I':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 2][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 3][currentCol] = FILLED_BLOCK;
                break;
            case 'J':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol + 1] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol + 2] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'L':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol - 1] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol - 2] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'O':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol + 1] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
                break;
            case 'S':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol + 1] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol - 1] = FILLED_BLOCK;
                break;
            case 'T':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol + 1] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol - 1] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'Z':
                tempBoard[currentRow][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow][currentCol - 1] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol] = FILLED_BLOCK;
                tempBoard[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
                break;
        }
        // Display the temporary board
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.print(tempBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < BOARD_HEIGHT && col >= 0 && col < BOARD_WIDTH;
    }

    private void dropShape() {
        currentRow++;
        if (!isValidPosition(currentRow, currentCol) || board[currentRow][currentCol] != EMPTY_BLOCK) {
            currentRow--;
            placeShape();
            currentRow = 0;
            currentCol = BOARD_WIDTH / 2;
            currentShape = generateRandomShape();
        }
    }

    private void placeShape() {
        switch (currentShape) {
            case 'I':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                board[currentRow + 2][currentCol] = FILLED_BLOCK;
                board[currentRow + 3][currentCol] = FILLED_BLOCK;
                break;
            case 'J':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol + 1] = FILLED_BLOCK;
                board[currentRow][currentCol + 2] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'L':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol - 1] = FILLED_BLOCK;
                board[currentRow][currentCol - 2] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'O':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol + 1] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                board[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
                break;
            case 'S':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol + 1] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                board[currentRow + 1][currentCol - 1] = FILLED_BLOCK;
                break;
            case 'T':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol + 1] = FILLED_BLOCK;
                board[currentRow][currentCol - 1] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                break;
            case 'Z':
                board[currentRow][currentCol] = FILLED_BLOCK;
                board[currentRow][currentCol - 1] = FILLED_BLOCK;
                board[currentRow + 1][currentCol] = FILLED_BLOCK;
                board[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
                break;
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            dropShape();
            System.out.println("Press enter to continue...");
            scanner.nextLine();
            clearScreen();
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        TetrisGame game = new TetrisGame();
        game.play();
    }
}
