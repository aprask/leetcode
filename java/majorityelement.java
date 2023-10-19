class majorityelement {
    public int majorityElement(int[] nums) {
        for(int i = 1; i < nums.length; i++) 
        {
            int compareVal = nums[i];
            int j; 
            for(j = i - 1; j >= 0 && compareVal < nums[j]; j--)
            {
                nums[j+1]=nums[j];
            }
            nums[j+1]=compareVal;
        }
        return nums[nums.length/2];
    }
}
