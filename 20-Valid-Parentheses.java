class Solution {
    public boolean isValid(String s) {
\tStack<Character> stack = new Stack<Character>();
\tfor (char c : s.toCharArray()) {
\t\tif (c == '(')
\t\t\tstack.push(')');
\t\telse if (c == '{')
\t\t\tstack.push('}');
\t\telse if (c == '[')
\t\t\tstack.push(']');
\t\telse if (stack.isEmpty() || stack.pop() != c)
\t\t\treturn false;
\t}
\treturn stack.isEmpty();
 }
}
