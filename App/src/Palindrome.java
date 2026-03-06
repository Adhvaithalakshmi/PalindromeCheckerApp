class PalindromeDeque {

    static char deque[] = new char[100];
    static int front = -1;
    static int rear = -1;

    static void insertRear(char ch) {
        if (front == -1) {
            front = 0;
        }
        deque[++rear] = ch;
    }

    static char deleteFront() {
        return deque[front++];
    }

    static char deleteRear() {
        return deque[rear--];
    }

    public static void main(String args[]) {

        String str = "madam";
        boolean palindrome = true;

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            insertRear(str.charAt(i));
        }

        // Compare front and rear
        while (front < rear) {
            char f = deleteFront();
            char r = deleteRear();

            if (f != r) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");
    }
}