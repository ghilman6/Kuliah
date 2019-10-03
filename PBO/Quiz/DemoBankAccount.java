public class DemoBankAccount{
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        //Menambahkan Saldo b1
        b1.deposit(239);
        
        double saldo = b1.getBalance(); 
        System.out.println("saldo b1 : "+saldo);        
        
        BankAccount b2= new BankAccount();
        b2.BankAccount("Joko");
        
        String namab2 = b2.getName();
        System.out.println(namab2);
        
        
    }

}