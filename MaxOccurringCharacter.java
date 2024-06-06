public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "hello world";

        char maxChar = findMaxOccurringCharacter(str);

        System.out.println("Maximum occurring character is: " + maxChar);
    }

    public static char findMaxOccurringCharacter(String str) {
        int[] charCount = new int[256]; // assuming ASCII characters only

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        int maxCount = 0;
        char maxChar = ' '; // initialize with a default value

        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}
