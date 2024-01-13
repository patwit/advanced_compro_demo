package polpinit.pattarawit.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;
    protected static int answer;
    private Scanner input;

    public GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }

    public int getMinNum() {
        return this.minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return this.maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getCorrectNum() {
        return this.correctNum;
    }

    public void setCorrectNum(int correctNum) {
        this.correctNum = correctNum;
    }

    public int getMaxTries() {
        return this.maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    @Override
    public String toString() {
        return "{" +
            " minNum='" + getMinNum() + "'" +
            ", maxNum='" + getMaxNum() + "'" +
            ", correctNum='" + getCorrectNum() + "'" +
            ", maxTries='" + getMaxTries() + "'" +
            "}";
    }

    public static int getNumOfGames(){
        return numOfGames;
    }

    public static void playGame() {
        genAnswer();
        guesses = new int[maxTries];
        numGuesses = 0;
        boolean win = false;
        System.out.println("Welcome to a number guessing game!");

        for (int i = 0; i < maxTries; i++) {
            System.out.print("Enter an integer between " + min + " and " + max + ":");
            int guess = input.nextInt();
            guesses[i] = guess;
            numGuesses++;

            if (!checkValidGuess(guess)) {
                System.err.println("The number must be between " + min + " and " + max);
                i--;
                continue;
            }

            if (guess == answer) {
                win = true;
                System.out.println("Congratulations!");
                break;
            } else if (guess < answer) {
                System.out.println("Try a higher number!");
            } else {
                System.out.println("Try a lower number!");
            }
        }

        if (!win) {
            System.out.println("You ran out of guesses. The answer was " + answer);
        } else {
            totalWins++;
            if (numGuesses < highScore) {
                highScore = numGuesses;
                System.out.println("New high score: " + highScore + " guesses!");
            }
        }
        totalGuesses += numGuesses;
        showPostGameOptions();
        logGameDetails(win);
    }

    public void genAnswer() {
        answer = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

}
