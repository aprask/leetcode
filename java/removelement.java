public class removeelement
{
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                k++;
            }
        }
        return k;
    }
}
