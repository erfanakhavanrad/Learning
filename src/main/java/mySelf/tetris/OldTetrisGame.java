//package mySelf.tetris;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * @author Erfan Akhavan Rad
// * @created 05/05/2024
// */
//public class TetrisGame {
//    private static final int BOARD_WIDTH = 10;
//    private static final int BOARD_HEIGHT = 20;
//    private static final int SHAPE_COUNT = 7;
//    private static final char EMPTY_BLOCK = '.';
//    private static final char FILLED_BLOCK = 'X';
//
//    private char[][] board;
//    private Random random;
//    private int currentRow, currentCol;
//    private char currentShape;
//
//    public TetrisGame() {
//        board = new char[BOARD_HEIGHT][BOARD_WIDTH];
//        random = new Random();
//        currentRow = 0;
//        currentCol = BOARD_WIDTH / 2;
//        currentShape = generateRandomShape();
//        initializeBoard();
//    }
//
//    private void initializeBoard() {
//        for (int i = 0; i < BOARD_HEIGHT; i++) {
//            for (int j = 0; j < BOARD_WIDTH; j++) {
//                board[i][j] = EMPTY_BLOCK;
//            }
//        }
//    }
//
//    private char generateRandomShape() {
//        char[] shapes = {'I', 'J', 'L', 'O', 'S', 'T', 'Z'};
//        return shapes[random.nextInt(SHAPE_COUNT)];
//    }
//
//    private void displayBoard() {
//        for (int i = 0; i < BOARD_HEIGHT; i++) {
//            for (int j = 0; j < BOARD_WIDTH; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private boolean isValidPosition(int row, int col) {
//        return row >= 0 && row < BOARD_HEIGHT && col >= 0 && col < BOARD_WIDTH;
//    }
//
//    private void dropShape() {
////        currentRow++;
////        if (!isValidPosition(currentRow, currentCol) || board[currentRow][currentCol] != EMPTY_BLOCK) {
////            currentRow--;
////            placeShape();
////            currentRow = 0;
////            currentCol = BOARD_WIDTH / 2;
////            currentShape = generateRandomShape();
////        }
//
//        currentRow++;
//        if (!isValidPosition(currentRow, currentCol) || board[currentRow][currentCol] != EMPTY_BLOCK) {
//            currentRow--;
//            placeShape(); // Place the shape on the board before returning
//            currentRow = 0;
//            currentCol = BOARD_WIDTH / 2;
//            currentShape = generateRandomShape();
//        }
//
//    }
//
//    private void placeShape() {
////        switch (currentShape) {
////            case 'I':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                board[currentRow + 2][currentCol] = FILLED_BLOCK;
////                board[currentRow + 3][currentCol] = FILLED_BLOCK;
////                break;
////            case 'J':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol + 1] = FILLED_BLOCK;
////                board[currentRow][currentCol + 2] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                break;
////            case 'L':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol - 1] = FILLED_BLOCK;
////                board[currentRow][currentCol - 2] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                break;
////            case 'O':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol + 1] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
////                break;
////            case 'S':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol + 1] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol - 1] = FILLED_BLOCK;
////                break;
////            case 'T':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol + 1] = FILLED_BLOCK;
////                board[currentRow][currentCol - 1] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                break;
////            case 'Z':
////                board[currentRow][currentCol] = FILLED_BLOCK;
////                board[currentRow][currentCol - 1] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol] = FILLED_BLOCK;
////                board[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
////                break;
////        }
//
//        switch (currentShape) {
//            case 'I':
//                if (isValidPosition(currentRow + 3, currentCol)) {
//                    board[currentRow][currentCol] = FILLED_BLOCK;
//                    board[currentRow + 1][currentCol] = FILLED_BLOCK;
//                    board[currentRow + 2][currentCol] = FILLED_BLOCK;
//                    board[currentRow + 3][currentCol] = FILLED_BLOCK;
//                }
//                break;
//            case 'J':
//                if (isValidPosition(currentRow + 1, currentCol) && isValidPosition(currentRow + 1, currentCol + 1) && isValidPosition(currentRow + 1, currentCol + 2) && isValidPosition(currentRow, currentCol + 2)) {
//                    board[currentRow][currentCol] = FILLED_BLOCK;
//                    board[currentRow + 1][currentCol] = FILLED_BLOCK;
//                    board[currentRow + 1][currentCol + 1] = FILLED_BLOCK;
//                    board[currentRow + 1][currentCol + 2] = FILLED_BLOCK;
//                }
//                break;
//            // Other cases for different shapes...
//        }
//
//    }
//
//    public void play() {
////        Scanner scanner = new Scanner(System.in);
////        while (true) {
////            displayBoard();
////            dropShape();
////            System.out.println("Press enter to continue...");
////            scanner.nextLine();
////            clearScreen();
////        }
//
////
////        Scanner scanner = new Scanner(System.in);
////        while (true) {
////            clearScreen();
////            dropShape();
////            displayBoard();
////            try {
////                Thread.sleep(500); // Adjust this value to control the speed of falling shapes
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
//
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            clearScreen();
//            initializeBoard(); // Clear the board before each frame
//            dropShape();
//            placeShape(); // Place the shape on the board
//            displayBoard();
//            try {
//                Thread.sleep(500); // Adjust this value to control the speed of falling shapes
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//    private void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
//
//    public static void main(String[] args) {
//        TetrisGame game = new TetrisGame();
//        game.play();
//    }
//}
