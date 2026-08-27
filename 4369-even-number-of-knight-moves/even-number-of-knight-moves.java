class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sum1 = Arrays.stream(start).sum();
        int sum2 = Arrays.stream(target).sum();
        return (sum1 % 2) == (sum2 % 2);
    }
}