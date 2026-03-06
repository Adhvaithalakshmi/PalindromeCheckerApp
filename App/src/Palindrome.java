public class Palindrome {
    static class Stack
    {
        char[] arr;
        int top;
        int size;
        Stack(int n) {
            arr = new char[n];
            size = n;
            top = -1;
        }
        void push(char ch) {
            if (top < size - 1) {
                arr[++top] = ch;
            }
        }
        char pop()
        {
            if(top>=0) {
                return arr[top--];
            }
            return '\0';
            }
        }
        static class Queue {
            char[] arr;
            int front, rear, size;

            Queue(int n) {
                arr = new char[n];
                size = n;
                front = 0;
                rear = -1;
            }

            void enqueue(char ch) {
                if (rear < size - 1) {
                    arr[++rear] = ch;
                }
            }

            char dequeue() {
                if (front <= rear) {
                    return arr[front++];
                }
                return '\0';
            }
        }
            public static void main(String[] args) {

            String str = "madam";

            Stack stack = new Stack(str.length());
            Queue queue = new Queue(str.length());

            // Push into stack & Enqueue into queue
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
                queue.enqueue(str.charAt(i));
            }

            boolean isPalindrome = true;

            // Compare dequeue (FIFO) vs pop (LIFO)
            for (int i = 0; i < str.length(); i++) {
                char fromQueue = queue.dequeue();
                char fromStack = stack.pop();

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(str + " is a Palindrome.");
            } else {
                System.out.println(str + " is NOT a Palindrome.");
            }
        }
        }