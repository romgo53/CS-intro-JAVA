package WongiSim1;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(combinedLetters("23"));
    }

    public static String combinedLetters(String digits) {


        return combinedLetters(digits, 0, "");
    }


    private static String combinedLetters(String digits, int i, String curr) {
        String[] digDict = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        if (digits.length() == i) {
            return curr;
        }
        String letters = digDict[digits.charAt(i) - '0'];
        return combine(letters, digits, i, 0, curr);
    }

    private static String combine(String letters, String digits, int i, int j, String curr) {
        if (j == letters.length())
            return "";

        String next = combinedLetters(digits, i + 1, curr + letters.charAt(j));

        if (j < letters.length()-1) {
            return next + " " + combine(letters, digits, i, j + 1, curr);
        }
        return next;
    }

}
