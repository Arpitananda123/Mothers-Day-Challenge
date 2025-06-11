public class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;
        while (i < s.length()) {
            // Downward direction
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index] += s.charAt(i++);
            }
            // Upward diagonal direction
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index] += s.charAt(i++);
            }
        }

        String news = "";
        for (int j = 0; j < ans.length; j++) {
            news += ans[j];
        }
        return news;
    }
    public static void main(String[] args) {
        ZigZag solution = new ZigZag();
        
        // Test input
        String s = "PAYPALISHIRING";
        int numRows = 3;

        // Output the result
        String result = solution.convert(s, numRows);
        System.out.println("Converted Zigzag String: " + result);
    }
    
}
