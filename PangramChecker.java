public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        if (isPangram(str)) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
