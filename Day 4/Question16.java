package org.example;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversedString = new StringBuilder(A).reverse().toString();
        if(A.compareTo(reversedString)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
