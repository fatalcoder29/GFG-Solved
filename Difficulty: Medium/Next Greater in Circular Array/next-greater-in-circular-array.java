import java.util.*;

class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        // Initially answer for every element is -1
        for (int i = 0; i < n; i++) {
            list.add(-1);
        }

        Stack<Integer> st = new Stack<>();

        // Traverse array twice because it is circular
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            // Current element is greater than waiting elements
            while (!st.isEmpty() && arr[index] > arr[st.peek()]) {

                int preIndex = st.pop();

                list.set(preIndex, arr[index]);
            }

            // Push only during the first traversal
            if (i < n) {
                st.push(index);
            }
        }

        return list;
    }
}