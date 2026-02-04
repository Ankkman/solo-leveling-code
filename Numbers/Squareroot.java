import java.util.Scanner;

public class Squareroot {
    public static int mySqrt(int x){
        if (x<2) return x;  // Base cases: sqrt(0)=0, sqrt(1)=1

        long left = 1;
        long right = x/2; // For x >= 2, sqrt(x) <= x/2

        while (left <= right){
            long mid = left + (right-left)/2 ;

            //    mid * mid >x
            // => mid > x/mid ; To avoid big multiplications (overflow).

            if (mid > x/mid ){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return (int) right;      // right ends at the largest value where right^2 <= x
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(mySqrt(n));;
    }
}
