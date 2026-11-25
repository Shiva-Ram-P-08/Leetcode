class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < s.length())
        {
            char ch = s.charAt(i);
            int idx = s.indexOf(ch, i + 1);
            int max = Math.max(i, idx);
            for(int j = i + 1; j <= max; j++)
            {
                char ch1 = s.charAt(j);
                int idx1 = s.indexOf(ch1, j + 1);
                max = Math.max(max, idx1);
            }
            list.add(max - i + 1);
            i = max + 1;
        } 
        return list;
    }
}