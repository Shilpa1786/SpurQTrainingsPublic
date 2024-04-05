package Loops;

public class ReverseNumber {
    public static void main(String[] args) {


        int num=1234, rem,reverse=0;

            // (num%10=rem);
            while (num != 0) {
                rem = num % 10;
                reverse =reverse*10+rem;
                num =num/10;

            }
        System.out.println(reverse);


        }
    }

