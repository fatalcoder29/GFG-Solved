class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> list  = new ArrayList<>();
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return list;
    }
}