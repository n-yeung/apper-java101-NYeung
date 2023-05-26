import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    static Map<String, ViewUser> accounts = new HashMap<String, ViewUser>();
    static boolean GUI;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        accounts.put("09175861661", new ViewUser("Bob", 100.0));
        accounts.put("09175861662", new ViewUser("Marley", 100.0));
        accounts.put("09175861663", new ViewUser("Seth", 100.0));
        accounts.put("09175861664", new ViewUser("Ryan", 100.0));
        accounts.put("09175861665", new ViewUser("Fritz", 100.0));

        System.out.println("To verify if existing users are correct");
        System.out.println("Number : Name : Current Balance");
        for (HashMap.Entry<String, ViewUser> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getName() + " : " + entry.getValue().getBalance());
        }
        System.out.println("verifying correct");
        System.out.println("*****************************************");
        System.out.println("**************PROGRAM START**************");
        System.out.println("*****************************************");

        GUI = true;
        while (GUI) {
            System.out.println("*****************************************");
            System.out.println("press 1 view all balance, 2 register account, 3 transfer load, 4 exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Number : Name : Current Balance");
                    for (HashMap.Entry<String, ViewUser> entry : accounts.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue().getName() + " : " + entry.getValue().getBalance());
                    }
                }
                case 2 -> {
                    System.out.println("Input Cellphone Number");
                    String PhoneNum = scanner.nextLine();
                    if (PhoneNum.length() < 11) {
                        System.out.println("Input must be a proper number");
                        GUI = false;
                    } else if (accounts.containsKey(PhoneNum)) {
                        System.out.println("Number already registered");
                        GUI = false;
                    } else {
                        System.out.println("Please input Name");
                        String NewName = scanner.nextLine();
                        if (NewName.isEmpty()) {
                            System.out.println("Input cannot be empty");
                            GUI = false;
                        } else {
                            accounts.put(PhoneNum, new ViewUser(NewName, 100.0));
                            System.out.println("Balance set to 100");
                            System.out.println("Successfully registered");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Transfer Funds");
                    System.out.println("Input Sender Number");
                    String senderNum = scanner.nextLine();
                    if (!accounts.containsKey(senderNum)) {
                        System.out.println("Number not registered");
                        GUI = false;
                    } else if (senderNum.isEmpty()) {
                        System.out.println("Input proper registered number");
                        GUI = false;
                    } else {
                        System.out.println("Input Recipient Number");
                        String recipientNum = scanner.nextLine();
                        if (!accounts.containsKey(recipientNum)) {
                            System.out.println("Number not registered");
                            GUI = false;
                        } else if (recipientNum.isEmpty()) {
                            System.out.println("Input proper registered number");
                            GUI = false;
                        } else if (senderNum.equals(recipientNum)) {
                            System.out.println("Sender and Recipient should not be the same");
                            GUI = false;
                        } else transferLoad(senderNum, recipientNum);
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using the system");
                    System.out.println("We hope to see you again");
                    GUI = false;
                }
                default -> {
                    System.out.println("Follow instructions, Thank you");
                    GUI = false;
                }
            }
            }

        }

        static void transferLoad(String x, String y){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input amount");
            double amountTransfer = scanner.nextDouble();
            if(amountTransfer <= 0.00){
                System.out.println("Input amount greater than 0");
                GUI = false;
            }else if(amountTransfer > accounts.get(x).getBalance()){
                System.out.println("Insufficient balance");
                GUI = false;
            } else {
                accounts.get(x).setBalance(accounts.get(x).getBalance()-amountTransfer);
                accounts.get(y).setBalance(accounts.get(y).getBalance()+amountTransfer);
                System.out.println("Load Transfer successful");
            }
        }
    }


