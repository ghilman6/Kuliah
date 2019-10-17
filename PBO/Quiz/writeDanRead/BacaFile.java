import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BacaFile{
    public static void main(String[] args) throws FileNotFoundException
    {
        //memasukan nama file oleh user
        Scanner masuk = new Scanner(System.in);
        System.out.print("Input file = ");
        String inputFileName = masuk.next();
        System.out.print("Output file = ");
        String outFileName = masuk.next();

            File Fileinput = new File (inputFileName);
            Scanner in = null;
            PrintWriter out= null;
           
            //Jika salah dalam memasukan nama file akan di beri tau
            try {
                in = new Scanner (Fileinput);
                out= new PrintWriter (outFileName);
            } catch (Exception e) {
                System.out.println("File input tidak di temukan");
            }
            int i=1;
            while(in.hasNextLine()){
                String baris = in.nextLine();
                out.print("/* "+i+" */");
                out.printf("%s \n",baris);
                i++;
            }
            
            in.close();
            out.close();
            System.out.println("file sudah di ubah :)");
    }
}