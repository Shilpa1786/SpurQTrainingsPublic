package Exersize;

import controlflowstatements.SwitchStatement;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 5;
        int res;
        String symb ="+";
        System.out.println("Enter your Choice");


        switch (symb) {
            case ("+"):
                res = no1 + no2;
                System.out.println(res);
                break;
            case ("-"):
                res = no1 - no2;
                System.out.println(res);
                break;
            case ("*"):
                res = no1 * no2;
                System.out.println(res);
                break;
            case ("/"):
                res = no1 / no2;
                System.out.println(res);
                break;
            default:
                System.out.println("invalid Symbol");
                break;
        }
    }
}
