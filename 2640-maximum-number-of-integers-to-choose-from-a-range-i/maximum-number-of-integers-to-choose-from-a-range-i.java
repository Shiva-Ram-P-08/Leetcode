class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0, count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int a : banned)
            set.add(a);
        for(int i = 1; i <= n; i++)
        {
            if(set.contains(i))
                continue;
            if(sum + i <= maxSum)
            {
                count++;
                sum += i;
            }
            else
                break;
        }
        return count;
    }
}