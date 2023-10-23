class Solution {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}
