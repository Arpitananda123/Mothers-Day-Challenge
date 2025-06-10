public class Reverseword {
    public String reverseWords(String s) {
        // Remove leading/trailing spaces and split the string by one or more spaces
        String[] words = s.trim().split("\\s+");
        String ans = "";

        // Append words in reverse order
        for (int i = words.length - 1; i > 0; i--) {
            ans += words[i] + " ";
        }

        // Append the first word without trailing space
        ans += words[0];

        return ans;
    }

    // Optional: Add a main method to test the function
    public static void main(String[] args) {
        Reverseword sol = new Reverseword();
        String input = "  Hello   world  this is  Java  ";
        String result = sol.reverseWords(input);
        System.out.println("Reversed Words: '" + result + "'");
    }
}
