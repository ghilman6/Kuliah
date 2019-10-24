public class array1{
    public static void main(String[] args) {
        int[] values = new int[10];
        values[0]=10;
        values[9]=10;
        //menampilkan array
        for(int q=0;q<=9;q++){
            if(q>0){
                System.out.print(" | ");
            }
            System.out.print(values[q]);
        }
    }
}