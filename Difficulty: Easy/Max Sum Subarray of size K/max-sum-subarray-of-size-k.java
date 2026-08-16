class Solution {
    public int maxSubarraySum(int[] nums, int k) {
           int low = 0;
        int high = k - 1;

        long sum = 0;

        // First window
        for (int i = low; i <= high; i++) {
            sum += nums[i];
        }

        long max_sum = sum;

        // Sliding window
        while (high < nums.length - 1) {
            low++;
            high++;

            sum = sum - nums[low - 1] + nums[high];

            max_sum = Math.max(max_sum, sum);
        }

        return (int) max_sum;
    }
}
