class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length-1;
        for(int i=0;i<n;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
        
    }
}
