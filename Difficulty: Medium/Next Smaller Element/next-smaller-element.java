class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(0,-1);
            }
            else{
                list.add(0,stack.peek());
        }
        stack.push(arr[i]);
    }
    return list;
  }
}