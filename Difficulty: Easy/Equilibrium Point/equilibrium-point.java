class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        int left=0;
        for(int i=0;i<arr.length;i++){
            int right=sum-arr[i]-left;
            if(left==right){
                return i;
            }
            left=left+arr[i];
        }
        return -1;
    }
}
