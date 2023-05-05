public class Datatypes {

    //zero value
    static int age; //valid declaration, global variable
    //static can be used by all objects in the class
    //static if not initialized will default to 0

    static double salary; //default is 0.0
    static boolean isHappy; //default is FALSE
    static char favoriteLetter; //default is a weird looking thing
    static float weight;
    static long distance;
    static Integer wrapperAge;
    static Boolean wrapperHappy;
    public static void main(String[] args) {
        //variable declared here is local variable
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperHappy);
        System.out.println("_____________________");
        Integer theAge = 10;
        System.out.println(theAge);

        theAge = theAge + 89;
        System.out.println(theAge);

        displayAgeInAFancyWay(theAge);
        System.out.println("value of theAge after method: " + theAge);

        System.out.println("_____________________");
        //Pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayAgeInAFancyWay(ages);
        System.out.println("value of theAge after calling fancy method: " + ages[0]);

        System.out.println("_____________________");
        //primitive to wrapper

        int numUsers = 100;
        Integer numberOfUsers = numUsers;

        System.out.println(numberOfUsers.intValue());
        System.out.println("_____________________");
        int a = 9, b = 10, c = 78;

        System.out.println(a + b * c);

        System.out.println(c++ + " " + ++c);
        System.out.println(c);
        System.out.println(a);





    }

    static void displayAgeInAFancyWay(Integer age){
        System.out.println("Fancy! " + age);
        age = age + 100;
    }

    static void displayAgeInAFancyWay(Integer[] age){
        System.out.println("Fancy! " + age[0]);
        age[0] = age[0] + 100;
    }
}