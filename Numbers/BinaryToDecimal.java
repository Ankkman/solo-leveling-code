import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec(int num){
        int dec = 0;
        int pow = 0;

        if(num==0){
            return 0;
        }

        while(num>0) {
            int ld = num%10;

            // Validation
            if (ld != 0 && ld != 1) {
                throw new IllegalArgumentException("Not a binary number");
            }

            dec = dec + (ld * (int) Math.pow(2,pow));
            num = num/10;
            pow++;

        }

        return dec;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(binToDec(x));

    }

}
