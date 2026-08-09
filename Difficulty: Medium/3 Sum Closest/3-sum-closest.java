import java.util.*;

class Solution {
    public int closest3Sum(int[] arr, int target) {

        Arrays.sort(arr);

        int resSum = arr[0] + arr[1] + arr[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                int diffTarget = Math.abs(sum - target);

                if (diffTarget < minDiff ||
                    (diffTarget == minDiff && sum > resSum)) {

                    resSum = sum;
                    minDiff = diffTarget;
                }

                if (sum == target) {
                    return target;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return resSum;
    }
}