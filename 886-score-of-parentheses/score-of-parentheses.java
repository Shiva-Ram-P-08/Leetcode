class Solution {
    public int scoreOfParentheses(String s) {
        int ans = 0, count = -1;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                count++;
            else
            {
                if(s.charAt(i - 1) == '(') 
                    ans += Math.pow(2, count);
                count--;
            }
        }
        return ans;
        /*
            "()"     2^0 = 1
            "(())"   2^1 = 2
            "()(())" 2^0 = 1 + 2^1 = 2, total = 3
        */
    }
}