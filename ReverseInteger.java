public class ReverseInteger {

    // Solution class with reverse method
    static class Solution {
        public int reverse(int x) {
            int num = Math.abs(x);  
            int rev = 0;  
            
            while (num != 0) {
                int ld = num % 10;  
                
                // Check for integer overflow before multiplying
                if (rev > (Integer.MAX_VALUE - ld) / 10) {
                    return 0;  // Overflow would occur
                }
                
                rev = rev * 10 + ld;  
                num = num / 10;  
            }
            
            return (x < 0) ? (-rev) : rev;  
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int input1 = 123;
        int input2 = -456;
        int input3 = 1534236469;  // This will overflow
        
        System.out.println("Reverse of " + input1 + " is: " + sol.reverse(input1));
        System.out.println("Reverse of " + input2 + " is: " + sol.reverse(input2));
        System.out.println("Reverse of " + input3 + " is: " + sol.reverse(input3));
    }
}


