public class SwitchStatements {
    public static void main(String[] args) {
        // soung of the animals
        // dog arf arf
        // cat meow meow
        // goat is meeh meeh
        // cow mooooh

        //String animal = "cat";
/*
        if(animal.equals("dog")){
            System.out.println("arf arf");
        }else if(animal.equals("cat")){
            System.out.println("meow meow");
        }else if(animal.equals("goat")){
            System.out.println("meeh meeh");
        }else if(animal.equals("cow")){
            System.out.println("moooh");
        }else{
            System.out.println("yehey!");
        }
*/      Animal animal = Animal.DOG;
        switch(animal){ // int and enum is also acceptable
            //add the break or else other cases will be included
            case DOG: System.out.println("arf arf"); break;
            case CAT: System.out.println("meow meow"); break;
            case GOAT: System.out.println("meeeeh"); break;
            case COW: System.out.println("mooooh"); break;
            //default: System.out.println("yehey"); break;
        }
    }

    public enum Animal{
        DOG, CAT, GOAT, COW
    }
}
