class Solution {
    public int maxSumSubarray(int[] arr) {
        // code here
        int noDel=arr[0];
        int oneDel=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int preNOdel=noDel;
            noDel=Math.max(arr[i],noDel+arr[i]);
            oneDel=Math.max(preNOdel,oneDel+arr[i]);
            res=Math.max(res,Math.max(oneDel,noDel));
        }
        return res;
    }
}