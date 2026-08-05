class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int officer =0;
        int res =1;
        int cm  =1;
        while(cm<n){
            if(arr[cm]== arr[cm-1]){
                cm++;
                continue;
            }
            arr[officer+1]=arr[cm];
            officer++;
            res++;
            cm++;
        }
        for(int i=0;i<=officer;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
