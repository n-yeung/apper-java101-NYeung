package QuizDay4.zoo;

public class Managers {
    public String name;
    public int age;
    public String initialTitle;

    public Managers(){}

    public Managers(String name, int age, String initialTitle) {
        this.name = name;
        this.age = age;
        this.initialTitle = initialTitle;
    }

    private void viewEmployeeSalary() {
        Employees employee = new Employees();
        employee.setSalary(10_000);
        System.out.println("employee salary: " + employee.getSalary());
    }

    private void viewVisitorAge(){
        Visitors visitor = new Visitors();
        visitor.setVisitorAge(18);
        System.out.println("visitor age: " + visitor.getVisitorAge());
    }

    public static void main(String[] args){
        Managers manager = new Managers();
        manager.viewEmployeeSalary();
        manager.viewVisitorAge();
    }
}
