package QuizDay4.zoo;

public class Visitors {
    public String name;
    private int age;

    public Visitors(){}

    public Visitors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getVisitorAge() {
        return age;
    }

    public void setVisitorAge(int age){
        this.age = age;
    }
}
