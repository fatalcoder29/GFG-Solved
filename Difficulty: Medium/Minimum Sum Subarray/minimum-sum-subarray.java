class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int bestEnd=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            bestEnd=Math.min(arr[i],arr[i]+bestEnd);
            ans= Math.min(ans,bestEnd);
        }
        return ans;
    }
}