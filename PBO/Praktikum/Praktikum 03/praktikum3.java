
public class praktikum3{
    public static void main(String[] args) {
     
    hewan kucing = new hewan();

     kucing.jenis=" ANGGOCING ";
     kucing.kaki=3;
     kucing.warna="Oren";
    System.out.println(" Jenis Kucing = " + kucing.jenis +
                        "\n Jumlah Kaki = " + kucing.kaki +
                        "\n Warna Hewan = " + kucing.warna );
    
    kucing.suara("Meooong");
    
    String makananan= kucing.makanan("jaka");

    System.out.println(makananan);
    }
}