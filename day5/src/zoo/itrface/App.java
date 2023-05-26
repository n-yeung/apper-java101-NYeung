package zoo.itrface;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breath();

        Fish fish = new Fish();
        fish.breath();

        ForWaterOnly a = new Fish();
        ForWaterOnly b = new Croc();

        excecuteForWaterOnly(a);
        excecuteForWaterOnly(b);
    }

    static void excecuteForWaterOnly(ForWaterOnly f){
        f.swim();
    }
}
