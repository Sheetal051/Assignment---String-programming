public class UniqueCharactersChecker {
    public static void main(String[] args) {
        String str = "abcdefg";

        if (hasAllUniqueCharacters(str)) {
            System.out.println(str + " has all unique characters.");
        } else {
            System.out.println(str + " does not have all unique characters.");
        }
    }

    public static boolean hasAllUniqueCharacters(String str) {
        boolean[] charSet = new boolean[256]; // assuming ASCII characters only

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                return false;
            }

            charSet[val] = true;
        }

        return true;
    }
}
