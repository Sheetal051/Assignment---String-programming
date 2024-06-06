public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "hellooooworld";
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256]; // assuming ASCII characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!seen[str.charAt(i)]) {
                result.append(str.charAt(i));
                seen[str.charAt(i)] = true;
            }
        }
        return result.toString();
    }
}
