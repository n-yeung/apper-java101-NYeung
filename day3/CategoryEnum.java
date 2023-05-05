public class CategoryEnum {
    public static void main(String[] args) {
        double price = 0;
        Category chosenCategory = Category.KID;
        switch(chosenCategory){ // int and enum is also acceptable
            //add the break or else other cases will be included
            case MEN: price = 13.57; break;
            case WOMEN: price = 20.45; break;
            case KID: price = 45.6; break;
            case GRANDMA: price = 56.67; break;
            case GRANDPA: price = 3.56; break;
            //default cases not needed since used enum
        }

        System.out.println(chosenCategory + " Price is: " + price);
    }

    public enum Category{
        MEN, WOMEN, KID, GRANDMA, GRANDPA
        //case sensitive
    }

}