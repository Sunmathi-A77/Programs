class Solution {
    public boolean isValid(String s) {
        
        /*Stack<Character> stack = new Stack();     //S-O(n)
        for(char ch : s.toCharArray())              //T-O(n)
        {
            if(ch=='(')
            {
                stack.push(')');
            }
            else if(ch=='[')
            {
                stack.push(']');
            }
            else if(ch=='{')
            {
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!=ch)
            {
                return false;
            }
        }
        return stack.isEmpty();*/

        Stack<Character> stack = new Stack();     //S-O(n)
        Map<Character, Character> m = new HashMap();       //S-O(1)
        m.put('(', ')');
        m.put('[', ']');
        m.put('{', '}');
        for(char ch : s.toCharArray())            //T-O(n)
        {
            if(ch=='(' || ch=='[' || ch=='{')
            {
                stack.push(m.get(ch));
            }
            else if(stack.isEmpty() || stack.pop()!=ch)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}