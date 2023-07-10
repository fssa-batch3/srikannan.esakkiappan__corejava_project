package day03.solved;


class TestAccount {
	 
    public static void main(String[] args) {
         
        //create Account
        Account acct1 = new Account("A101", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
         
         
        //create Account
        Account acct2 = new Account("A102","Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
    }
 
}

public class Account {
	 
    public String accNo;
 
    public String name;
 
    public double balance;
 
    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
     
 
}

