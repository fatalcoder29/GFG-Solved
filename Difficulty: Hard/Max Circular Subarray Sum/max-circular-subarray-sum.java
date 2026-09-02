class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum=arr[0];
        int maxEnd=arr[0],maxSum=arr[0];
        int minEnd=arr[0],minSum=arr[0];
        
        for(int i=1;i<arr.length;i++){
            totalSum+=arr[i];
            maxEnd=Math.max(arr[i],maxEnd+arr[i]);
            maxSum=Math.max(maxSum,maxEnd);
            minEnd=Math.min(arr[i],minEnd+arr[i]);
            minSum=Math.min(minSum,minEnd);
        }
        if(maxSum<0){
            return maxSum;
        }
        int circularMax=totalSum-minSum;
        
        return Math.max(maxSum,circularMax);
    }
}
