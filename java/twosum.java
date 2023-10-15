class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] pairNum = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    pairNum[0] = i;
                    pairNum[1] = j;
                    return pairNum;
                }
            }
        }
        return pairNum;
    }
}