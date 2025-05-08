// File: FindNthDigit.java

import java.util.Scanner;

public class FindNthDigit {

    // The main logic method
    public int findNthDigit(int n) {
        long digitInNum = 1, start = 1, end = 9;

        while (n > digitInNum * end) {
            n -= digitInNum * end;
            digitInNum++;
            start *= 10;
            end *= 10;
        }

        long num = start + (n - 1) / digitInNum;
        String numStr = Long.toString(num);
        return numStr.charAt((int) ((n - 1) % digitInNum)) - '0';
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindNthDigit solution = new FindNthDigit();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int result = solution.findNthDigit(n);
        System.out.println("The " + n + "th digit in the sequence is: " + result);

        scanner.close();
    }
}

