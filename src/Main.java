import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account alex = new Account();
        alex.setName("Alex");
        alex.setId("14514555");
        alex.setBalance(100);

        Account salem = new Account("salem", "154485456");
        salem.setBalance(20000);
        Account khaled = new Account("khaled", "544541544", 5000);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(alex);
        accounts.add(salem);
        accounts.add(khaled);

        Account account = null;
        String id = "";
        System.out.print("Please enter account id: ");
        id = input.nextLine();
        for (Account a : accounts) {
            if (a.getId().equals(id))
                account = a;


        }

        if (account != null){
            System.out.println("Welcome to our bank "+account.getName());

        }else {
            System.out.println("Account not found");
            return;
        }
        while (account != null) {

            System.out.println("\n");
            System.out.println("1 to print account details");
            System.out.println("2 to credit account");
            System.out.println("3 to debit account");
            System.out.println("4 to transfer to account");
            System.out.println("5 to exit");

            int choice = input.nextInt();

            int amount = 0;
            switch (choice) {
                case 1:
                    print(account);
                    break;
                case 2:
                    System.out.print("Add amount to account: ");
                    amount = input.nextInt();
                    account.credit(amount);
                    break;
                case 3:
                        System.out.print("Please enter amount to debit account: ");
                        amount = input.nextInt();
                        account.debit(amount);

                    break;
                case 4:
                    String transfer_message = "Account does not exist";
                    System.out.print("Enter account ID of account to debit account : ");
                    String transferto_id  = input.next();

                    for (Account a : accounts) {
                        if (a.getId().equals(transferto_id)) {
                            System.out.print("Please enter amount");
                            amount = input.nextInt();
                            account.transferTo(a, amount);
                            transfer_message = "transfer to account successful";

                        }
                    }
                    System.out.println(transfer_message);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }


        }

//        _____________________________________Employee_________________________________________________________________

//        Employee salem1 = new Employee();

//        Employee khaled = new Employee("554455555","Khaled",5000);

//        salem.setName("Salem");
//        salem.setId("454384789847");
//        salem.setSalary(20000);
//
//        System.out.println("Welcome "+salem.getName());
//        System.out.println("Your id is : "+salem.getId());
//        System.out.println(("Your salary is : "+ salem.getSalary());
//
//
//

//        salem.raisedSalary(30);
//
//        khaled.print();
//        khaled.raisedSalary(50);
//        khaled.print();


    }




    public static void  print(Account a ) {
         System.out.println("__________________");
         System.out.println("| Account details |");
         System.out.println("__________________");

         a.print();

    }

}
