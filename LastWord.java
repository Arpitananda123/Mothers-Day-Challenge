public class LastWord {
    public int lengthOfLastWord(String s) {
        String[] ans = s.trim().split(" ");
        return ans[ans.length - 1].length();
    }

    public static void main(String[] args) {
        LastWord sol = new LastWord();
        
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "luffy is still joyboy";

        System.out.println("Length of last word: " + sol.lengthOfLastWord(input1)); // Output: 5
        System.out.println("Length of last word: " + sol.lengthOfLastWord(input2)); // Output: 4
        System.out.println("Length of last word: " + sol.lengthOfLastWord(input3)); // Output: 6
    }
}
