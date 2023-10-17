public class removeduplicate
{
    public int removeDuplicates(int[] nums) {
        for(int i = 1; i < nums.length; i++)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                if(nums[i] == nums[j])
                {
                    nums[j] = 0;
                }
            }
        }
        int k = 0;
        for (int num : nums) {
            if (num != 0) {
                k++;
            }
        }
        return k;
    }
}
