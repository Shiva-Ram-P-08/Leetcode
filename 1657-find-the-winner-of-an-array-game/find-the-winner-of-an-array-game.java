class Solution {
    public int getWinner(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr)
            list.add(a);

        if(k >= list.size()) // When k greater than array length, the max value will wins default
            return Collections.max(list);
        
        int prev = -1;
        int count = 0;
        while(count != k)
        {
            int max = Math.max(list.get(0), list.get(1));
            int min = Math.min(list.get(0), list.get(1));
            if(prev == max)
                count++;
            else
            {
                prev = max;
                count = 1;
            }
            list.remove(Integer.valueOf(min));
            list.add(min);
        }
        return prev;
    }
}