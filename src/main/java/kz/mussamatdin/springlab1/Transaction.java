package kz.mussamatdin.springlab1;
public abstract class Transaction
{
    private int accountNumber;   // indicates account involved
    private Screen screen;     // ATM's screen
    private BankDatabase bankDatabase; // account info database
    // Transaction constructor invoked by subclasses using super()
    public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase){
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }  // end Transaction constructor
    // return account number
    public int getAccountNumber(){
        return accountNumber;
    }  // end method
    // return reference to screen
    public Screen getScreen(){
        return screen;
    }  // end method
    // return reference to bank database
    public BankDatabase getBankDatabase(){
        return bankDatabase;
    }  // end method
    // perform the transaction (overridden by each subclass)
    abstract public void execute();
}  // end class Transaction