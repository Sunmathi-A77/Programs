import java.util.*;

class Solution {
    public long shadowPairs(int[] nums) {
        int n = nums.length;
        int[] stackVal = new int[n];
        int top = 0;
        long ans = 0;

        for (int num : nums) {
            // Count elements in stackVal[0..top-1] that are strictly less than num
            int count = lowerBound(stackVal, top, num);
            ans += count;

            // Pop elements strictly greater than num (keep stack non-decreasing)
            while (top > 0 && stackVal[top - 1] > num) {
                top--;
            }
            stackVal[top++] = num;
        }

        return ans;
    }

    // Returns the number of elements in stackVal[0..size-1] that are < target
    private int lowerBound(int[] arr, int size, int target) {
        int lo = 0, hi = size;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}