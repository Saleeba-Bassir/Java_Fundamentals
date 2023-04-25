public class PuzzleTest {

    public static void main(String[] args) {
        int[] rolls = PuzzleJava.getTenRolls();
        System.out.println("Ten Rolls:");
        for (int roll : rolls) {
            System.out.print(roll + " ");
        }
        System.out.println();

        char randomLetter = PuzzleJava.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        String password = PuzzleJava.generatePassword();
        System.out.println("Random Password: " + password);

        String[] passwordSet = PuzzleJava.getNewPasswordSet(7);
        System.out.println("New Password Set:");
        for (String pass : passwordSet) {
            System.out.println(pass);
        }
}
}

