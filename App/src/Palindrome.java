public class Palindrome {
    static void main() {
   String str="madam";
   char[] arr=str.toCharArray();
   int start=0;
   int end=arr.length-1;
   boolean isPalindrome =true;
   while(start<end)
   {
       if(arr[start] != arr[end])
       {
           isPalindrome =false;
           break;
       }
       start++;
       end--;
   }
   if(isPalindrome) {
       System.out.println(str + "is a palindrome.");
   } else{
       System.out.println(str + "is not a palindrome.");
   }
   }
    }