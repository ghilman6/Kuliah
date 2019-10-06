import java.util.Scanner;

public class tugas02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,n,hasil=0;
        int nilai = 2;
        int nilai2 = 0;
        
        //1.	Buatlah program untuk mencetak semua angka genap antara 10 sampai 20
        /*for(a=10;a<=20;a+=2){
            System.out.println(a);
        }*/

        //2.    Buatlah program untuk menghitung nilai penjumlahan dari 1 sampai n
        /*System.out.print("Masukan angka = ");
        n=input.nextInt();
        for(a=1;a<=n;a++){
            hasil=hasil+a;
        }
        System.out.println("Penjumlahan dari 1 sampai " + n + " : "+ hasil);
        */
    
        //NO 3
        /*do{
             System.out.print("Masukan angka < 100 : "); 
             nilai = input.nextInt();
        }while(nilai <= 100);*/
        
        //NO 4
        /*do{
            System.out.print("Masukan angka < 100 : "); 
            nilai = input.nextInt();
            if(0<nilai&&nilai<100){
            System.out.print("Angka yg di masukan < 100 ");
            }
       }while(nilai <= 100);*/

        //NO 5
        /*
        while(nilai <= 100){
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
        } 
        */

        //NO 6 Buatlah program, yang menerima serangkaian integer (berhenti saat menerima angka 0)
        /*
        while(nilai != 0){
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
        }
        */

        // NO 7
        /*
        while(nilai != 0){
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
            hasil = hasil + nilai;
        }
        System.out.print("Hasil : " + hasil);
        */

        // NO 8 
       /* while( nilai !=0 && nilai != nilai2){
            nilai2 = nilai;
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
            hasil = hasil + nilai;
        }
        System.out.print("Hasil : " + hasil);
        */
        
    }
}