import java.util.Scanner;
public class Praktikum2{
    public static void main(String[] args) {
    int a ;
    
    //For Looping
    /* 
    for(a=0;a<10;a++){
        System.out.println("Ini looping ke "+a);
    }*/

    //While Looping
    /*while(a<10){
        System.out.println("Ini looping ke "+a);
        a++;
    }
    */
    //do
    /*    
    do{
        System.out.println("Ini looping ke "+a); 
        a++;
    }while (a<10);
   */
  
    Scanner input = new Scanner(System.in);
    int b;
    System.out.print("Masukan Angka B = ");
    b = input.nextInt(); 
    //if percabangan 
/*
    if(a<b){
        System.out.println("B lebih besar dari pada 0");
    }else{
        System.out.println("Nilai B adalah negatif atau 0 ");
    }
*/
//  Switch case
    switch(b)
    {
    case 1:
    System.out.println("Ini angka yang di masukan adalah satu"); break;
    case 2:
    System.out.println("Ini angka yang di masukan adalah dua"); break;
    case 3:
    System.out.println("Ini angka yang di masukan adalah tiga"); break;
    case 4:
    System.out.println("Ini angka yang di masukan adalah empat"); break;
    case 5:
    System.out.println("Ini angka yang di masukan adalah lima"); break;
    default:
    System.out.println("Angka yang dimasukkan ");  
    }

    }
}