class BankAccountRunner {
public static class BankAccount {

    // Add Class Attributes accountNumber, accountHolderName and balance
    public int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount() {
        // complete default constructor

    }
    // Add Parameterized 2 Constructors


    public BankAccount(String name, int accountnum) {

        this.accountHolderName = name;
        this.accountNumber = accountnum;
        this.balance = 0;


    }

    public BankAccount(String name, int accountnum, double bal) {

        this.accountHolderName = name;
        this.accountNumber = accountnum;
        this.balance = bal;

    }


    // Accessor methods for private attributes also known as 'Getters'
    String getAccountHolderName() {


        // return account holder name;
        return accountHolderName;

    }

    double getBalance() {
        return balance;

        // return current account balance;

    }

    void deposit(double amount) {
        this.balance += amount;

        // update value of account balance. Add value amount to current balance

    }

    void widthdraw(double amount) {

        //update value of account balance. Subtract value of amount from current
        //balance only if current balance is >= amount.
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Invalid transaction. Amount being widthdrawn is greater than the account's current balance");
        }

        // Display error message is amount being widthdrawn is greater than the
        // account's current balance.


    }

}


    public static void main(String args[]) {

        //create BankAccount Objects
        BankAccount bankaccount1 = new BankAccount();




        //Display initial object attributes
        System.out.println(bankaccount1.getAccountHolderName());
        System.out.println(bankaccount1.getBalance());



        //Add and Widthdraw money to/from accounts


        //Display final object attributes


    }
}