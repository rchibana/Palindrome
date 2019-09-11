/**
 * Created by Rodrigo Chibana
 * Date: 11/09/2019
 **/
public class Palindrome {

    public static boolean isPalindrome(String word) {

        //ignoring case sensitive
        final char[] stack = word.toLowerCase().toCharArray();

        for(int i = 0; i < stack.length / 2; i++) {
            if(!(stack[i] == stack[(stack.length - 1) - i])) {
                return false;
            }
        }

        return true;

    }

}
