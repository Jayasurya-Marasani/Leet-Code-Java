class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            
            }
            else if (!st.isEmpty() &&((s.charAt(i)==')' && st.peek() == '(')|| (s.charAt(i)=='}' && st.peek() =='{') || (s.charAt(i)==']' && st.peek() == '[')))
            {
                st.pop();
            }
            else 
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}
