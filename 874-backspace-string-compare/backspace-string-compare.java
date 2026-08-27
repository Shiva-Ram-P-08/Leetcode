class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0, j = 0;
        while(i < s.length() || j < t.length())
        {
            if(i < s.length())
            {
                char ch = s.charAt(i);
                if(ch == '#')
                {
                    if(sb1.length() > 0)
                        sb1.deleteCharAt(sb1.length() - 1);
                }
                else
                    sb1.append(ch);
                i++;
            }
            if(j < t.length())
            {
                char ch = t.charAt(j);
                if(ch == '#')
                {
                    if(sb2.length() > 0)
                        sb2.deleteCharAt(sb2.length() - 1);
                }
                else
                    sb2.append(ch);
                j++;
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}