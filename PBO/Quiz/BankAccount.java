import static java.lang.System.out;

public class BankAccount {
    //property
    private double balance;
    //1 add property account name
    private String accountName;
    //constructor
    public BankAccount() {
        //balance = 0;
        this.balance = 0;
        //2 initialize account name
        this.accountName = "user";
    }
    //4 overload constructor
    public void setName(String nama) {
        this.balance = 0;
        this.accountName = nama;
    }
    
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.accountName;
    }
    //3 method print detail
    void print(){
        System.out.println("-------Akun-----");
        System.out.println("Name = "+ this.accountName);
        System.out.println("saldo = "+ this.balance);
    }
    
    //5 method transfer
    public void transfer(double amount,BankAccount dest) {
        //saldo kita di kurangi 
        this.balance = this.balance-amount;
        //saldo tujuan di tambah
        dest.deposit(amount);

    }
}