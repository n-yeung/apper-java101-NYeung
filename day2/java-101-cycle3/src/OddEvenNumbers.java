public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(isEven(60));
    }

    public static boolean isEven(int num){
        boolean result = false;
        int modResult = num % 2;
        if(modResult == 0) result = true;
        return result;

    }
}
