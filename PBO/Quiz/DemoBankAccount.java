public class DemoBankAccount{
    public static void main(String[] args) {
        
        BankAccount b1= new BankAccount();
        
        //Menambahkan Saldo b1
        b1.deposit(239);     
        
        //Membuat akun b2
        BankAccount b2= new BankAccount();
        
        //Mengubah nama user b2 dan menambah saldo 
        b2.setName("Joko");
        b2.deposit(231);
        
        //Mencetak nama user dan jumlah saldo 
        //b2.print();
        //b1.print();
        
        //Mentransfer 
        b1.transfer(100, b2);
        b2.print();
        b1.print();
        b2.setName("oko");
        b2.print();
    
    }

}