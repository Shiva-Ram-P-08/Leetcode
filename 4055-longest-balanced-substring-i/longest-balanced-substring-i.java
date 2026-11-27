class Solution {
    public int longestBalanced(String s) {
        int max = 1;
        for(int i = 0; i < s.length(); i++)
        {
            int freq[] = new int[26];
            for(int j = i; j < s.length(); j++)
            {
                freq[s.charAt(j) - 'a']++;
                boolean check = true;
                int val = 0;
                for(int a : freq)
                {
                    if(a > 0)
                    {
                        if(val == 0)
                            val = a;
                        else if(val != a)
                        {
                            check = false;
                            break;
                        }
                    }
                }
                if(check)
                    max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}