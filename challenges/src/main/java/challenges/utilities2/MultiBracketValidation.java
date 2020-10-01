package challenges.utilities2;

import java.util.HashMap;

public class MultiBracketValidation {

    public static void main(String[] arg) {
        MultiBracketValidation valid = new MultiBracketValidation();
        System.out.println(valid.multiBracketValidation("[({}]"));
    }

    // Website I used to understand and construct the multiBracketValidation method https://www.programcreek.com/2012/12/leetcode-valid-parentheses-java/
    public boolean multiBracketValidation(String input) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if(map.containsKey(current)) {
                stack.push(current);
            } else if (map.containsValue(current)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == current) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
