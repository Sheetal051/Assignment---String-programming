public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "hellooooworld";
        printDuplicates(str);
    }

    public static void printDuplicates(String str) {
        boolean[] printed = new boolean[256]; // assuming ASCII characters
        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 &&!printed[str.charAt(i)]) {
                System.out.println(str.charAt(i) + " appears " + count + " times");
                printed[str.charAt(i)] = true;
            }
        }
    }
}
