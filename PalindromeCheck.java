public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "2552";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(str + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
