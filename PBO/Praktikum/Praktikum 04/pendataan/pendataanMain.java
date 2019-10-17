public class pendataanMain{
    public static void main(String[] args) {

        pendataan karyawan1 = new pendataan("05060708","muklis","Margonda",25,"muklis@123.com");
        karyawan1.tampil(1);
        pendataan karyawan2 = new pendataan("05060709","Mahmud","Lenteng",23,"mahmud@123.com");
        karyawan2.tampil(2);
        pendataan karyawan3 = new pendataan("05060710","udin katagawa","Jepang",21,"udinK@123.com");
        karyawan3.tampil(3); 
        
        karyawan1.in_id("80706050");
        karyawan1.tampil(1);
        karyawan2.in_id("90706050");
        karyawan2.tampil(2);
        karyawan3.in_id("01706050");
        karyawan3.tampil(3);

    }
}