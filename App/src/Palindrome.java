class PalindromePerformance {

    static boolean twoPointer(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) if (str.charAt(start++) != str.charAt(end--)) return false;
        return true;
    }

    static boolean stackPalindrome(String str) {
        int n = str.length();
        char[] stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) stack[++top] = str.charAt(i);
        for (int i = 0; i < n; i++) if (stack[top--] != str.charAt(i)) return false;
        return true;
    }

    static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String args[]) {

        String str = "madam".repeat(1000); // safe for recursion

        long startTime, endTime;

        // Two-Pointer
        startTime = System.nanoTime();
        boolean res1 = twoPointer(str);
        endTime = System.nanoTime();
        System.out.println("Two-Pointer: " + res1 + ", Time (ns): " + (endTime - startTime));

        // Stack
        startTime = System.nanoTime();
        boolean res2 = stackPalindrome(str);
        endTime = System.nanoTime();
        System.out.println("Stack:       " + res2 + ", Time (ns): " + (endTime - startTime));

        // Recursive
        try {
            startTime = System.nanoTime();
            boolean res3 = recursivePalindrome(str, 0, str.length() - 1);
            endTime = System.nanoTime();
            System.out.println("Recursive:   " + res3 + ", Time (ns): " + (endTime - startTime));
        } catch (StackOverflowError e) {
            System.out.println("Recursive:   StackOverflowError (string too large)");
        }
    }
}