package org.example;

import java.util.*;

public class Question14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String res = S.substring(start, end);
        System.out.println(res);
    }
}
