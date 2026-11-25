class Solution {
    public int minimumSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++)
        {
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                if(nums[i] < nums[j])
                {
                    for(int k = j + 1; k < nums.length; k++)
                    {
                        if(nums[k] < nums[j])
                        {
                            ans = Math.min(ans, nums[i] + nums[j] + nums[k]);
                        }
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}