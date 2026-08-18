class Solution {
    public int longestKSubstr(String s, int k) {
        
        int n = s.length();
        int low=0;
        int res = -1;
        Map<Character,Integer> f = new HashMap<>();
        for(int high=0;high<n;high++){
            char c = s.charAt(high);
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.size()>k){
                char leftch=s.charAt(low);
                f.put(leftch,f.get(leftch)-1);
                if(f.get(leftch)==0){
                    f.remove(leftch);
                }
                low++;
            }
            if(f.size()==k){
                res=Math.max(res,high-low+1);
            }
            
        }
        return res;
    }
}