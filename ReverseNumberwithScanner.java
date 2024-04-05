package Loops;

import java.util.Scanner;

public class ReverseNumberwithScanner {
    int num;
    int rem;
    int reverse = 0;

    void getseries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter series of number to find out reverse");
        num = sc.nextInt();
    }
    void reverse() {
        while (num != 0) {
            rem = num % 10;
            reverse =reverse*10+rem;
            num = num / 10;

        }
        System.out.println(reverse);
    }
        public static void main (String[]args){
            ReverseNumberwithScanner rn = new ReverseNumberwithScanner();
            rn.getseries();
            rn.reverse();
        }
    }

