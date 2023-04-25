import java.util.Random;

public class PuzzleJava {

    public static int[] getTenRolls() {
        int[] rolls = new int[10];
        Random rand = new Random();
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rand.nextInt(20) + 1;
        }
        return rolls;
    }

    public static char getRandomLetter() {
        Random rand = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = rand.nextInt(26);
        return alphabet[randomIndex];
    }

    public static String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public static void testGeneratePassword() {
        PuzzleJava puzzle = new PuzzleJava();
        String password = puzzle.generatePassword();
        System.out.println("Random password: " + password);
    }

    public static String[] getNewPasswordSet(int length) {
    String[] passwordSet = new String[length];
    for (int i = 0; i < length; i++) {
        passwordSet[i] = generatePassword();
    }
    return passwordSet;
}


}

