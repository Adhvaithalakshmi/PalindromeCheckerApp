import java.util.Stack;
public class Palindrome {
    static void main() {
        String str="madam";
        Stack<Character>stack =new Stack<>();
        for(int i=0;i<str.length();i++) {
            stack.push(str.charAt(i));
        }
        boolean isPalindrome=true;
        for(int i=0;i<str.length();i++){
            char poppedChar = stack.pop();
            if (str.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(str + "is a palindrome.");
        }
        else{
            System.out.println(str + "is not a palindrome.");
   }
   }
    }