public class Account {


    private String name;
    private String id;
    private int balance;


    public void credit(int amount ) {
        if(amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
    }

    public void debit(int amount ) {
        if(amount <= 0) {
            System.out.println("Invalid amount");

        } else if (amount > balance) {
            System.out.println("Insufficient balance");

        }

        balance -= amount;

    }

    public void transferTo(Account destination, int amount) {

        if(amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }else if(amount > balance) {
            System.out.println("Insufficient balance");
        }

        destination.balance += amount;
        this.debit(amount);

    }

    public void print() {

        System.out.println("|   Name: " + name);
        System.out.println("|   ID: " + id);
        System.out.println("|   Balance: " + balance);
        System.out.println("__________________");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if(balance <= 0) {
            System.out.println("Invalid balance");
        }else
             this.balance = balance;
    }



    Account(){
        this.balance = 0;
    }

    Account(String name, String id){
        this.name = name;
        this.id = id;

    }

    Account(String name, String id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }







}
