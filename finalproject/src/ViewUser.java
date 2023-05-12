public class ViewUser {

        private String name;
        private double currentBalance;

        public ViewUser(){}

        public ViewUser(String name, double currentBalance) {
            this.name = name;
            this.currentBalance = currentBalance;
        }

        public String getName(){
            return this.name;
        }

        public double getBalance(){
            return this.currentBalance;
        }

        public double setBalance(double x){
            this.currentBalance = x;
            return this.currentBalance;
        }



    /*
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>();
        users.put("1234567890", new User("John Doe", 100.0));
    }*/
}
