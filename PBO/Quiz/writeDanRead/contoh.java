import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BacaFile{
    public static void main(String [] args)throws FileNotFoundException{
    
    //tanya user nama file input dan output
    
    System.out.println("File input?");
    Scanner console = new Scanner(System.in);
    String namaFileInput = console.nextLine();

    System.out.println("File output?");
    console = new Scanner(System.in);
    String namaFileoutput = console.nextLine();
    
    //buat objek file dan printwraiter
    File fileInput = new File(namaFileInput);
    Scanner in = new Scanner(fileInput);
    PrintWriter out = new PrintWriter(namaFileoutput);

    //baca semua agngka di dile input
    int i=1;
    while(in.hasNextLine()){
        String line = in.nextLine();
        out.println("/* "+i+" */"+line);
        i++;
    }
    in.close();
    out.close();
    }
}