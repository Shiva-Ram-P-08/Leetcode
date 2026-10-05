class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++)
            list.add(new ArrayList<>());
        int i = 0;
        boolean check = false;
        for(char ch : s.toCharArray())
        {
            list.get(i).add(ch);
            if(check)
            {
                i--;
                if(i == 0)
                    check = false;
            }
            else
            {
                i++;
                if(i == numRows - 1)
                    check = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(ArrayList<Character> l : list)
        {
            for(char ch : l)
                sb.append(ch);
        }
        return sb.toString();
    }
}