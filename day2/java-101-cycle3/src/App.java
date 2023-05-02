public class App { //***If class is public, the class name should be the same as the filename
    public static void main(String[] args) { //***shortcut pvsm then tab
        System.out.println("Hello World"); //***shortcut sout then tab (shortcut only in intelliJ

        //let us talk about variables
        int quantity = 9;
        int _quantity____ = 9;
        //int 82quantity = 9; INVALID

        //camelcase
        double myGrade = 89.9;
        //snakecase is ALL CAPS, use if static variable
        //double MY_GRADE = 89.9;

        int age = 15; // data type int, name is age, value is 15

        //numeric whole number data types: short, int, long
        //int max is 2 raised to 32
        //shot max is 2 raised to 16
        //long max is 2 raised to 64
        System.out.println(age);

        age = age +10;
        System.out.println(age);

        long myBalanceInGcash = 1000000000;
        long newBalance = myBalanceInGcash + age;
        System.out.println(newBalance);

        //decimal: double and float
        //double much bigger than float
        allAboutDecimalFloat(age);

        //String
        allAboutString();

        //greetings
        greetings();
    }

    public static void greetings(){
        System.out.println("Wassup broski");
    }

    public static void allAboutString(){
        int number1 = 1;
        char number1char = '1';
        String number1string = "1"; //array of characters ['1','','',.....]

        String myName = "Orvyl"; //use this
        char[] myNameArr = new char[]{'o','r','v','y','l'};//over this

        System.out.println(myName);
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());

        String completeName = myName + " tumaneng";
        System.out.println(completeName);
        System.out.println(myName.substring(2,5));

        boolean isEqualName = myName.equals("orvyl");
        boolean isEqualIgnoreCase = myName.equalsIgnoreCase("orvyl");

        System.out.println(isEqualName + " " + isEqualIgnoreCase);

    }

    public static void allAboutDecimalFloat(int age){
        //double is bigger than float
        double price = 4.45;
        double newPrice = price + age;
        System.out.println(newPrice);

        //to call float, you need an f at the end of decimal
        float discount = 9.56f;
        double subtotal = newPrice + discount;
        System.out.println(subtotal);

        double num1 = 1;
        float num2 = 4000.54f;
        double result = num1 + num2;

        int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(resultMaxValue);
    }
}
