class Solution {
    public int maximumSwap(int num) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++)
        {
            int a = Character.getNumericValue(str.charAt(i));
            map.put(a, i);
        }
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++)
        {
            int val1 = Character.getNumericValue(str.charAt(i));
            for(int val2 : map.descendingKeySet())
            {
                int idx = map.get(val2);
                if(val2 > val1 && idx > i)
                {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(idx));
                    sb.setCharAt(idx, temp);
                    return Integer.parseInt(sb.toString());
                }   
            }
        }
        return num; 
    }
}