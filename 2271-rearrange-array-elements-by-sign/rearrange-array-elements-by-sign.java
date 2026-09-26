class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, ne = 0;
        for(int i = 0; i < n; i ++)
        {
            if(nums[i] > 0)
            {
                pos[p++] = nums[i];
            }
            else
            {
                neg[ne++] = nums[i];
            }
        }
        int j = 0;
        for(int i = 0; i < n / 2; i ++)
        {
            nums[j] = pos[i];
            j += 2;
        }
        j = 1;
        for(int i = 0; i < n/2; i ++)
        {
            nums[j] = neg[i];
            j += 2;
        }
        return nums;
    }
}