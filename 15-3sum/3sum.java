class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        /*List<List<Integer>> result = new ArrayList<>();        // TC - O(n^3)      SC - O(no of triplets)  -- TLE
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length-2; i++)
        {
            for(int j=i+1; j<nums.length-1; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k]  == 0)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        result.addAll(set);
        return result;*/

        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) 
        {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) 
            {
                int required = -(nums[i] + nums[j]);
                if (set.contains(required)) 
                {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], required);
                    Collections.sort(triplet);

                    resultSet.add(triplet);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
    }
}