class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
        // code here
        int n= arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        long prefixSum=0;
        int count=0;
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            int rem=(int)(prefixSum%k);
            
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
