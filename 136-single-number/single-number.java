class Solution {
    public int singleNumber(int[] nums) {
        
        for(int i = 0; i < nums.length; i ++)     //TC - O(n^2)
        {                                           //SC - O(1)
            int count = 0;
            int num = nums[i];
            for(int j = 0; j < nums.length; j ++)
            {
                if(nums[j] == num)
                {
                    count ++;
                }
            }
            if(count == 1)
            {
                return num;
            }
        }
        return -1;

        //This approach works well when the numbers are non-negative and not extremely large. If nums contains negative numbers, hash[nums[i]] will cause an error.
        
        /*int maxi = nums[0];                         //TC - O(n+n+n) = O(n)
        for(int i = 0; i < nums.length; i ++)       //SC - O(maxLength+1)
        {
            maxi = Math.max(maxi, nums[i]);
        }
        int[] hash = new int[maxi + 1];
        for(int i = 0; i < nums.length; i ++)
        {
            hash[nums[i]]++;
        }
        for(int i = 0; i < nums.length; i ++)
        {
            if(hash[nums[i]] == 1)
            {
                return nums[i];
            }
        }
        return -1;*/
    }
}