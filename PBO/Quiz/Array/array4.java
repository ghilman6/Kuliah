    public class array4 {
        public static void main(String[] args) {
            int[] nilai = {20, 11, 53, 21, 35, 4, 82, 9, 22};
            int max = 0;
            int min = 10;
            for (int a = 0; a < nilai.length; a++) {
                if (nilai[a] > max) {
                    max = nilai[a];
                } else if (nilai[a] < min) {
                    min = nilai[a];
                }
            }
            for(int i=0; i<nilai.length; i++){
                System.out.print(nilai[i] + " ");
            }
            System.out.println("\n Nilai Maksimum : " + max);
        }
    }