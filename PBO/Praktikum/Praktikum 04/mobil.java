public class mobil{
    private String jenis;
    private String merek;
    private int cc;

    public void inJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void inMerek(String merek) {
        this.merek = merek;
    }

    public void inCC(int CC) {
        this.cc = CC;
    }

    public String typeVehicle() {
        return jenis;
    }

    public String MerekVehicle() {
        return merek;
    }
    
    public int ccVehicle() {
        return cc;
    }
}