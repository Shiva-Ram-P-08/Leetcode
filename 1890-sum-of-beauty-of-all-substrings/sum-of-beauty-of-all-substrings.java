class Solution {
    public int beautySum(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int len = s.length();
            while(len > i)
            {
                String str = s.substring(i, len);
                len--;
                if(str.length() <= 2)
                    break;
                int arr[] = new int[26];
                for(char ch : str.toCharArray())
                {
                    arr[ch - 'a']++;
                }
                Arrays.sort(arr);
                int min = 0, max = arr[25];
                for(int a : arr)
                {
                    if(a != 0)
                    {
                        min = a;
                        break;
                    }
                }
                count += (max - min);
            }
        }
        return count;
    }
}