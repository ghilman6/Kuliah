public class array3{
    public static void main(String[] args) {
    int arrayNumbers[] = { 3, -4, 7, -3, -2};
    int negativeCount = 0;
    for (int i = 0; i <= 4; i++){
        if (arrayNumbers[i] <= 0){
        negativeCount++;
        }
    }
    System.out.println("jumlah negatif dari array : "+negativeCount);
    }
}