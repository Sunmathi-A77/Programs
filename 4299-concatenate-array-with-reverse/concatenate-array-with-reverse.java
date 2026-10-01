class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        int l = 0;
        int r = n - 1;
        for(int i = 0; i < n; i++)
        {
            ans[i] = nums[i];
        }
        // while(l<r)
        // {
        //     int temp = nums[l];
        //     nums[l] = nums[r];
        //     nums[r] = temp;
        //     l++;
        //     r--;
        // }
        for(int i = 0; i < n; i++)
        {
            ans[i + n] = nums[n - i - 1];
        }
        return ans;
    }
}