
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        if(s.length()<=1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar=='['){
                stack.push(currentChar);
            }
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topOfStack = stack.pop();

                if (currentChar == ')' && topOfStack != '(') {
                    return false;
                }
                if (currentChar == '}' && topOfStack != '{') {
                    return false;
                }
                if (currentChar == ']' && topOfStack != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
.