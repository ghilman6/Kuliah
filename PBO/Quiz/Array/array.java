public class array{
    public static void main(String[] args) {
        int[] primes = {2,3,5,7,11};
        System.out.println("Array sebelum berubah : ");
        
        for(int w=0;w<=4;w++){
            if(w>0){
                System.out.print(" | ");
            }
            System.out.print(primes[w]);
        }
        //number 2
        for (int i = 0; i < 2; i++)
        {
            primes[4 - i] = primes[i];
        }
        //number 3
        for (int i = 0; i < 5; i++)
        {
            primes[i]++;
        }
        System.out.println();
        System.out.println("Array sesudah berubah : ");
        for(int q=0;q<=4;q++){
            if(q>0){
                System.out.print(" | ");
            }
            System.out.print(primes[q]);
        }
    }
}