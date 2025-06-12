public class MaxVowel {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            // Early exit if max is already k
            if (max == k) {
                return max;
            }

            // Check current character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove character left outside the window
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    count--;
                }
            }

            // Update max vowels seen in a window
            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    // Test the function
    public static void main(String[] args) {
        MaxVowel sol = new MaxVowel();
        String s = "abciiidef";
        int k = 3;
        int result = sol.maxVowels(s, k);
        System.out.println("Maximum number of vowels in a substring of length " + k + ": " + result);
    }
}
