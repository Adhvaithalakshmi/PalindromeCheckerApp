
class PalindromeIgnore {

    public static void main(String args[]) {

        String str = "Madam In Eden Im Adam";

        // Normalize string: remove spaces, convert to lowercase
        str = str.replaceAll(" ", "").toLowerCase();

        boolean palindrome = true;
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}