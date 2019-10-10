import java.util.Scanner;

public class Demomobil{
    public static void main(String[] args) {
        mobil sedan = new mobil("SUV","BMW",1999);
        /*
        sedan.inMerek("BMW");
        sedan.inJenis("SUV");
        sedan.inCC(1999);
        */

        //Scanner input = new Scanner(System.in);

        System.out.println("Sedan");
        System.out.println("Jenis : "+ sedan.typeVehicle());
        System.out.println("Merek : "+ sedan.MerekVehicle());
        System.out.println("CC : "+ sedan.ccVehicle());
    }
}