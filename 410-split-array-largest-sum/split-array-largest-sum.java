class Solution {
    public int splitArray(int[] nums, int k) {
        
        int lo = 0;
        int hi = 0;

        for(int x : nums)
        {
            lo = Math.max(lo, x);
            hi += x;
        }

        while(lo < hi)
        {
            int mid = lo + (hi - lo) / 2;
            int parts = 1;
            int sum = 0;
            for(int x : nums)
            {
                if(sum + x > mid)
                {
                    parts ++;
                    sum = x;
                }
                else
                {
                    sum += x;
                }
            }

            if(parts > k)
            {
                lo = mid + 1;
            }
            else
            {
                hi = mid;
            }
        }
        return lo;
    }
}