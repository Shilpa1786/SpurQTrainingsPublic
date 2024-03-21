package Exersize;

public class FactorialProgram {
    public static void main(String[] args)

    {
        int factno = 7;
        int fact = 1;
        for (int i = 1; i <= factno; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of "+factno+" is:" +fact);
    }
}
