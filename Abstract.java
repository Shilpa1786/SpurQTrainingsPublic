package OOPS;


import java.util.Scanner;

abstract class Shape {
    public abstract double Area();
    void getdataforCircle(){
        Scanner sc =  new Scanner(System.in);
        {
            System.out.println("Enter radius");
          int radius = sc.nextInt();
        }
    }
}
    class Circle1 extends Shape {
        public double Area() {
                int radius;
                double pi=3.15;
                double area;
                area = pi * radius * radius;
                return area;
            }
        }
        class rectangles extends Shape {
            @Override
            public double Area() {
                int l = 10;
                int w = 5;
                return l * w;

            }
        }
            class square extends Shape{
                @Override
                public double Area() {
                    int a=2;

                    return a*a;
                }
            }

public class Abstract {
        public static void main(String[] args){
         Shape cir = new Circle1();
         cir.getdataforCircle();
            System.out.println(cir.Area());
            Shape rect = new rectangles();
            System.out.println( "Area of rectangle =" +rect.Area());
            Shape sq =new square();
            System.out.println("Area of square = " +sq.Area());

      }
}

