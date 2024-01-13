package polpinit.pattarawit.lab5;

public class TestGuessNumberGame {
    public static void testPart1() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        gng1.playGame();
        System.out.println("There are " + GuessNumberGameVer1.getNumOfGames() + " games");
        gng1.setMinNum(2);
        gng1.setMaxNum(5);
        gng1.setMaxTries(2);
        System.out.println(
                "Min = " + gng1.getMinNum() + " Max = " + gng1.getMaxNum() + " Max tries = " + gng1.getMaxTries());
        gng1.playGame();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1();
        System.out.println(
                "Min = " + gng2.getMinNum() + " Max = " + gng2.getMaxNum() + " Max tries = " + gng2.getMaxTries());
        System.out.println("There are " + GuessNumberGameVer1.getNumOfGames() + " games");
    }

    public static void testPlayGamesStats() {
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(1, 5, 3);
        System.out.println(gng);
        gng.playGames();
    }

    public static void main(String[] args) {
        testPlayGamesStats();
    }

    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20, 5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
    }

    public static void testSetterGetterMethods() {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first guess number game is");
        System.out.println(gng);
        System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 20);
        System.out.println("Creating another guess number game");
        System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames());

        gng2.setMinNum(2);
        gng2.setMaxNum(5);
        gng2.setMaxTries(2);
        System.out.println("GuessNumberGame with new settings");
        System.out.println(gng2);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", max num is " + gng.getMaxNum() +
                ", and max tries is " + gng.getMaxTries());
    }

    public static void testPlayGames() {
        GuessNumberGameVer2 gng = new GuessNumberGameVer2(5, 10, 4);
        gng.playGames();
    }

}

