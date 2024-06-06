public class RemoveDuplicates {
    public static void main(String[] args) {
        String originalString = "hellooooworld";
        String uniqueString = removeDuplicates(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("String without duplicates: " + uniqueString);
    }

    public static String removeDuplicates(String str) {
        StringBuilder uniqueStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (uniqueStr.indexOf(String.valueOf(c)) == -1) {
                uniqueStr.append(c);
            }
        }
        return uniqueStr.toString();
    }
}
