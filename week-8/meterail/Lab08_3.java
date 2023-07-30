import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Account{
    private String id;
    private String fullname;
    private double balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
public class Lab08_3 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static void menu(){
        System.out.print("\n=== The Bank ===\n" +
                "1. Account List\n" +
                "2. Create an account\n" +
                "3. Deposit to an account\n" +
                "4. Withdraw from an account\n" +
                "5. Transfer to another account\n" +
                "6. Quit\n" +
                "Choose an opt:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->{
                System.out.println("\n=== Account List ===");
                listAccount();
                menu();
            }
            case 2->{
                System.out.println("\n=== Create an account ===");
                createAccount();
                menu();
            }
            case 3->{
                System.out.println("\n=== Deposit to an account ===");
                deposit();
                menu();
            }
            case 4->{
                System.out.println("\n=== Withdraw from an account ===");
                withdraw();
                menu();
            }
            case 5->{
                System.out.println("\n=== Transfer to another account ===");
                transfer();
                menu();
            }
            case 6->System.out.println("Quited");
            default -> menu();
        }
    }
    private static void listAccount(){
       if(accounts.size() == 0){
           System.out.println("Account not available");
           return;
       }
       int no=1;
       for(Account account : accounts){
           System.out.println("\nNO #"+no);
           System.out.println("ID: "+account.getId());
           System.out.println("Holder: "+account.getFullname());
           System.out.println("Balance: "+account.getBalance()+"$");
           no++;
       }
    }
    private static void createAccount(){
        System.out.print("\nNew Account ID: ");
        String id = sc.next();
        for(Account account : accounts){
           if(account.getId()==id){
               System.out.println("This id has been already!");
               createAccount();
           }
        }
        System.out.print("Fullname: ");
        sc.nextLine();
        String fullname = sc.nextLine();
        Account account = new Account();
        account.setId(id);
        account.setFullname(fullname);
        account.setBalance(0);
        accounts.add(account);
        System.out.println("New Account is created successfully");
        menu();
    }
    private static void deposit(){
        System.out.print("Account ID: ");
        String id = sc.next();
        boolean verify = false;
        int index =0;
        for(Account account : accounts){
            if(account.getId().equals(id)){
                System.out.println("* "+ account.getFullname());
                verify = true;
                break;
            }
            index++;
        }
        double amount;
        if(verify){
            System.out.print("Deposit amount :");
            try {
                amount = sc.nextDouble();
                    accounts.get(index).setBalance(accounts.get(index).getBalance()+amount);
                    System.out.println("Deposition is successfully");
            }catch (InputMismatchException e){
                System.out.println("Don't input characters.Please input only digit");
                deposit();
            }
        }else{
            System.out.println("This account is not available");
            deposit();
        }
    }
    private static void withdraw() {
        System.out.print("Account ID: ");
        String id = sc.next();
        boolean verify = false;
        int index =0;
        for(Account account : accounts){
            if(account.getId().equals(id)){
                System.out.println("* "+ account.getFullname());
                verify = true;
                break;
            }
            index++;
        }
        double amount;
        if(verify){
            System.out.print("Withdraw amount :");
            try {
                amount = sc.nextDouble();
                if(amount<=accounts.get(index).getBalance()){
                    accounts.get(index).setBalance(accounts.get(index).getBalance()-amount);
                    System.out.println("Withdraw is successfully");
                }else{
                    System.out.println("You have insufficient balance in your source account");
                    withdraw();
                }
            }catch (InputMismatchException e){
                System.out.println("Don't input characters.Please input only digit");
                withdraw();
            }

        }else{
            System.out.println("This account is not available");
            withdraw();
        }
    }
    private static void transfer(){
        System.out.print("From ID: ");
        String fromID = sc.next();
        boolean verify = false;
        int index =0;
        for(Account account : accounts){
            if(account.getId().equals(fromID)){
                System.out.println("* "+ account.getFullname());
                verify = true;
                break;
            }
            index++;
        }

        if(verify){
            System.out.print("From ID: ");
            String toID = sc.next();
            boolean verify1 = false;
            int index1 =0;
            for(Account account : accounts){
                if(account.getId().equals(toID)){
                    System.out.println("=> "+ account.getFullname());
                    verify1 = true;
                    break;
                }
                index1++;
            }
            double amount;
            if(verify1){
                System.out.print("Amount: ");
                try{
                    amount = sc.nextDouble();
                    if(amount<=accounts.get(index).getBalance()){
                            accounts.get(index).setBalance(accounts.get(index).getBalance()-amount);
                            accounts.get(index1).setBalance(accounts.get(index1).getBalance()+amount);
                            System.out.println("Transfer is successfully");
                    }else{
                        System.out.println("You have insufficient balance in your source account");
                        transfer();
                    }
                }catch (InputMismatchException e){
                    System.out.println("Don't input characters.Please input only digit");
                    transfer();
                }

            }else{
                System.out.println("Thise account not available");
                transfer();
            }
        }else{
            System.out.println("Thise account not available");
            transfer();
        }
    }
    public static void main(String[] args){
        menu();
    }
}
