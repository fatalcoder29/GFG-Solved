import java.util.*;

class Solution {
    public boolean hasTripletSum(int[] arr, int target) {

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int required = target - arr[i];

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[j] + arr[k];

                if (sum == required) {
                    return true;
                }

                else if (sum < required) {
                    j++;
                }

                else {
                    k--;
                }
            }
        }

        return false;
    }
}