import java.util.Scanner;

public class PrimeNumber {
    static boolean CheckPrime(int x) {
        if (x <= 1) return false;
        else {
            for(int i = 2; i < x; i++) {
                if(x % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int num = sc.nextInt();
        if(CheckPrime(num)) System.out.println("Number is a Prime");
        else System.out.println("Number is not a Prime");
    }
}

