public class OddEven {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        oddOrEven(nums);
    }

    static void oddOrEven(int[] NumArray){
        int odd = 0;
        int even = 0;
        for(int i=0; i <= 13; i++){
            int value = NumArray[i] % 2;
            if(value == 0) odd++;
            else even++;
        }
        System.out.println("Odd Numbers Count: " + odd);
        System.out.println("Even Numbers Count: " + even);
    }
}
