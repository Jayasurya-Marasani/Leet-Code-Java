// Approach Using Brute Force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result [] = new int [2];
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}



// Approach Using Hash Map
// import the necessary packages

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int result [] = new int [2];
        for(int i = 0; i<nums.length; i++)
        {
            if(hmap.containsKey(target - nums[i]))
            {
                result[0] = hmap.get(target - nums[i]);
                result[1] = i;
                break;
            }
            else
            {
                hmap.put(nums[i], i);
            }
        }
        return result;
    }
}
