package org.example;

import java.util.*;

public class Question9 {
    static int B;
    static int H;
    static boolean flag = false;

    static {
        try {
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();
            scanner.close();

            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
