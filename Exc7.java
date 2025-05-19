class Account
{
    private String name;
    private int accountNumber;
    private double balance;
    private String addressString;
    private String accountType;

   public Account(String n,int number,double bal){
         name = n;
         accountNumber = number;
         balance = bal;
   }

   public Account(string n, int a, double b, String add,String t)
{
    name=n;
    accountNumber=a;
    balance=b;
    addressString=add;
    accountType=t;
}

  public double getBalance(){
        return balance;
  }

  public void deposit(double amount){
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount");
  }

    public void withdraw(double amount){
            if (amount > 0 && amount <= balance)
                balance -= amount;
            else
                System.out.println("Invalid withdraw amount");
    }

}


public class Exc7
{
    public static void main(String[] args)
    {
       Account a1 = new Account();

    }
}
