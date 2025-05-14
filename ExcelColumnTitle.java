// File: ExcelColumnTitle.java

public class ExcelColumnTitle {

    // This method converts a column number to its Excel column title
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Convert to 0-based index
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }

        return res.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        ExcelColumnTitle solution = new ExcelColumnTitle();

        // Test cases
        int[] testInputs = {1, 26, 27, 28, 52, 701, 702, 703};
        for (int columnNumber : testInputs) {
            String title = solution.convertToTitle(columnNumber);
            System.out.println("Column " + columnNumber + " => " + title);
        }
    }
}

