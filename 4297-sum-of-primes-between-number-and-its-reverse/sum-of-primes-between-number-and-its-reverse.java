class Solution {
    public int sumOfPrimesInRange(int n) {
        String str = new StringBuilder(String.valueOf(n)).reverse().toString();
        int rev = Integer.parseInt(str);
        int sum = 0;
        int a = Math.min(n, rev), b = Math.max(n, rev);
        for(int i = a; i <= b; i++)
        {
            if(func(i))
                sum += i;
        }
        return sum;
    }
    public boolean func(int val)
    {
        int count = 0;
        if(val <= 1)
            return false;
        for(int i = 1; i <= val; i++)
        {
            if(val % i == 0)
                count++;
            if(count > 2)
                return false;
        }
        return true;
    }
}