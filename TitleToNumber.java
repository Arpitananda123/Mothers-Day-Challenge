public class TitleToNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        System.out.println("A -> " + solution.titleToNumber("A"));       // Output: 1
        System.out.println("Z -> " + solution.titleToNumber("Z"));       // Output: 26
        System.out.println("AA -> " + solution.titleToNumber("AA"));     // Output: 27
        System.out.println("AB -> " + solution.titleToNumber("AB"));     // Output: 28
        System.out.println("ZY -> " + solution.titleToNumber("ZY"));     // Output: 701
    }
}

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}

