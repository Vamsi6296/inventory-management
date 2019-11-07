package com.salesforce.rpt;

import java.util.Scanner;

/**
 * The entry point for the Test program
 */
public class Solution {

    //10 spaces between column headers
    static final String COLUMN_SEPARATOR = "          ";

    //Column headers, first column (name) should be left-aligned, rest (numbers) should be right-aligned
    static final String[] COLUMN_HEADERS = {
            "Item Name",
            "Buy At",
            "Sell At",
            "On Hand",
            "Value"
    };

    //Report labels
    static final String REPORT_TITLE = "INVENTORY REPORT";
    static final String LINE_SEPARATOR = "-";
    static final String TOTAL_VALUE_OF_INVENTORY = "Total value of inventory";
    static final String PROFIT_SINCE_LAST_REPORT = "Profit since last report";


    public void doIt(String input) {
        //todo: provide your implementation here


    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        //read from cmd line
        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();

            //continue until we hit '*'
            //please see input.txt for sample input
            if ("*".equals(line)) {
                break;
            }

            //do the work
            //see out.txt for sample output
            solution.doIt(line);
        }
    }
}
