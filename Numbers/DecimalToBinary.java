import java.util.Scanner;

public class DecimalToBinary {

    public static int decToBin(int num){
        int bin = 0;
        int pow = 0;

        if(num==0){
            return 0;
        }

        while(num>0) {
            int rem = num%2;
            bin = bin + rem * (int) Math.pow(10,pow);
            num = num/2;
            pow++;
        }
        return bin;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(decToBin(x));

        sc.close();

    }
}



