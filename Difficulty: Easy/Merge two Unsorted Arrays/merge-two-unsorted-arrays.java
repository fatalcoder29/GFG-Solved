
import java.util.*;
class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int m = a.length;
        int n= b.length;
        int [] res = new int[m+n];
        int idx=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                res[idx]=a[i];
                idx++;
                i++;
            }
            else{
                res[idx]=b[j];
                idx++;
                j++;
            }
            
        }
            while(i<m){
                res[idx]=a[i];
                idx++;
                i++;
            }
            while(j<n){
                res[idx]=b[j];
                idx++;
                j++;
            }
        return res;
    }
}