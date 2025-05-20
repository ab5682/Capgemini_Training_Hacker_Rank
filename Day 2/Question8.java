package org.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNext()){
            String str = in.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }
}