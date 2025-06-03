public class NoofSegment {
    public int countSegments(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        } else {
            String[] strs = s.trim().split("\\s+");
            return strs.length;
        }
    }

    public static void main(String[] args) {
        NoofSegment solution = new NoofSegment();

        // Example test cases
        String test1 = "Hello, my name is John";
        String test2 = "   ";
        String test3 = "OneWord";
        String test4 = "    Leading and trailing spaces     ";
        String test5 = "";

        System.out.println("Test 1: " + solution.countSegments(test1)); // Output: 5
        System.out.println("Test 2: " + solution.countSegments(test2)); // Output: 0
        System.out.println("Test 3: " + solution.countSegments(test3)); // Output: 1
        System.out.println("Test 4: " + solution.countSegments(test4)); // Output: 4
        System.out.println("Test 5: " + solution.countSegments(test5)); // Output: 0
    }
}
