import java.util.Scanner;

public class PrimeNumberV2 {
    static boolean CheckPrime(int x) {
        if (x <= 1) return false; //1 is special
            else {
            for(int i = 2; i < x; i++) {
                if(x % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:"); //input range is 1 - 10,000,000
        //int max is greater than 10,000,000 so use int
        int num = sc.nextInt();
        if (num >= 1 && num < 10000001) {
            long startTime = System.nanoTime();
            if (CheckPrime(num)) System.out.println("Number is a Prime");
            else System.out.println("Number is not a Prime");
            long endTime = System.nanoTime();
            System.out.println("Operating Time: " + (endTime-startTime));
        }else System.out.println("Input number is out of range");
    }
}
