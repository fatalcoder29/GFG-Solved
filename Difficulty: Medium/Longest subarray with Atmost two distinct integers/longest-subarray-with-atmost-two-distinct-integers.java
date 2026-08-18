class Solution {
    public int totalElements(int[] arr) {
        
        int n = arr.length;
        int low=0;
        int res=0;
        Map<Integer,Integer> f = new HashMap<>();
        for(int high=0;high<n;high++){
            int c = arr[high];
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.size()>2){
                int leftch= arr[low];
                f.put(leftch,f.get(leftch)-1);
                if(f.get(leftch)==0){
                    f.remove(leftch);
                }
                low++;
            }
            if(f.size()<=2){
                res=Math.max(res,high-low+1);
            }
        }
        return res;
    }
}