package coding.challenge.java;
import java.util.*;

public class BalanseParenthesesStack {
    static String input;
    public static boolean isValid(String in){
        Map<Character, Character> map = new HashMap<>();
            map.put('{', '}');
            map.put('[', ']');
            map.put('(', ')');
        Stack<Character> stack = new Stack<>();

        for (char ch : in.toCharArray()){
            if(map.containsKey(ch)) stack.push(ch);
        else if(!stack.empty() && map.get(stack.peek()) == ch) stack.pop();
            else return false;} return stack.empty();

    }
    public static void main(String args[]){
        input = "[{}]";
        System.out.println(input + (isValid(input) ?  " - valid":" -invalid"));
        input = "[{]";
        System.out.println(input + (isValid(input) ?  " - valid":" -invalid"));
        input = " ";
        System.out.println(input + (isValid(input) ?  " - valid":" -invalid"));
    }
}
