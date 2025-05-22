package org.example;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if(s.isEmpty()){
            System.out.println(0);
        }
        // Write your code here.
        else{
            String regex = "[ !,?._'@]+";
            String[] arr = s.split(regex);

            System.out.println(arr.length);

            for(int i = 0; i<arr.length;i++){
                System.out.println(arr[i]);

            }}
        scan.close();
    }
}
