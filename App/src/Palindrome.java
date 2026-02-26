public class Palindrome {
    static void main() {
        String original ="madam";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println(original + "is a palindrome.");
        } else {
            System.out.println(original + "is not a palindrome.");
        }
    }
}