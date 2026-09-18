class Solution {
    public int majorityElement(int[] nums) {
        
        /*Arrays.sort(nums);      //O(n log n)
        int n = nums.length;    //O(n)
        return nums[n/2];*/

        //Boyer more voting algorithm   TC-O(n) , SC-O(1)
        /*int voter = nums[0];
        int vc=1;
        for(int i=1; i<nums.length; i++)
        {
            if(voter == nums[i])
            {
                ++vc;
            }
            else
            {
                --vc;
            }
            if(vc == 0)
            {
                voter = nums[i];
                vc = 1;
            }
        }
        return voter;*/

        /*int n = nums.length;                //TC - O(n^2)
        int cnt = 0;
        for(int i = 0; i < n; i ++)
        {
            cnt = 0;
            for(int j = 0; j < n; j ++)
            {
                if(nums[j] == nums[i])
                {
                    cnt ++;
                }
            }
            if(cnt > n/2)
            {
                return nums[i];
            }
        }
        return -1;*/

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > n/2)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}