import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);


//1. Types should be compatible
//2. Destination > Source type ex. (Float > int)

        // Type Casting
//        int num = (int)(95.63f);
//        System.out.println(num);

        byte b = 42;
        char c = 'a';
        short s = 101;
        int i = 5000;
        float f = 5.847f;
        double d = 0.1234;
        double result = (f*b)+ (i/c)-(d*s);
        System.out.println((f*b)+"   "+(i/c)+"  "+(d*s));
        System.out.println(result);




    }
}



