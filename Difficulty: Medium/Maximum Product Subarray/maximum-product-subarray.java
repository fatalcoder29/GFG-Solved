class Solution {
    int maxProduct(int[] arr) {
        // code here
        int minEnd=arr[0];
        int maxEnd=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=arr[i]*minEnd;
            int v2=arr[i]*maxEnd;
            int v3=arr[i];
            maxEnd=Math.max(v3,Math.max(v2,v1));
            minEnd=Math.min(v3,Math.min(v2,v1));
            
            res=Math.max(res,Math.max(maxEnd,minEnd));
        }
        return res;
    }
}