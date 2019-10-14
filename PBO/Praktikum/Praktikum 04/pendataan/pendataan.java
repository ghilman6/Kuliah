public class pendataan{
    private String id;
    String nama;
    String alamat;
    int usia;
    String email;
    int karyawan;

   public pendataan( String id,String nama, String alamat, int usia, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.email = email;
    }

    public void inId(String id) {
        this.id=id;
    }

    public void tampil(int karyawan) {
        System.out.println("           KARYWAN "+ karyawan);
        System.out.println(" ");
        System.out.println("ID  = "+this.id);
        System.out.println("Nama  = "+this.nama);
        System.out.println("Alamat  = "+this.alamat);
        System.out.println("Usia  = "+this.usia);
        System.out.println("Email  = "+this.email);
        System.out.println(" ");
    }

    public void in_id(String id){
        this.id=id;
    }

}