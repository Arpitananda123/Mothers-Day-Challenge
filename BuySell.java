public class BuySell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuySell sol = new BuySell();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Test 1): " + sol.maxProfit(prices1)); // Output: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Test 2): " + sol.maxProfit(prices2)); // Output: 0

        // Test case 3
        int[] prices3 = {2, 4, 1};
        System.out.println("Max Profit (Test 3): " + sol.maxProfit(prices3)); // Output: 2
    }
}
