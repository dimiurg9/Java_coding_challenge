package CC_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//whithin the class:
//        1. declare static String input;
//        2. create a boolean method isValid which accepts String in as an argument
//        3. define map Map which key = Character, value = Character, assign new HashMap<>();
//        4. to the map add {}
//        5. to the map add []
//        6. to the map add ()
//        7. define Stack stack which accept Character, assign it to Stack
//        8. create for loop:
//        for (char ch : in.toCharArray()){
//        if(map.containsKey(ch)) stack.push(ch);
//        else if(!stack.empty() && map.get(stack.peek()) == ch) stack.pop();
//        else return false;} return stack.empty();
//        9.create main class which takes String as an args[]
//        10. declare variable input, assing any variation of parentheses
//        11. print results System.out.println(input + (isValid(input) ?  " - valid":" -invalid"));

public class BalanceParenthesesStackPractice {
    static String input;
    public static boolean isValid(String in){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (char ch : in.toCharArray()){
            if(map.containsKey(ch)) stack.push(ch);
            else if (!stack.empty() && map.get(stack.peek())== ch) stack.pop();
            else return false;}
        return stack.empty();
    }
    public static void main(String args[]){
        input = "(({{[[]]}}))";
        System.out.println(input + (isValid(input)? " -valid":" -invalid"));
        input = "(())[[{]}}";
        System.out.println(input + (isValid(input)? " -valid": " -invalid"));
    }
}







