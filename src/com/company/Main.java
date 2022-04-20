package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c= scanner.next().charAt(0);
        System.out.println(Arrays.toString(solution.shortestToChar(s,c)));
        System.out.println(Arrays.toString(solution.test(s,c)));
    }
}