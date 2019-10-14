public class Contohnya{
    int a = 0;
    int b = 0;
    int c = 0;
    string d= " ";

    public void contoh1 (int a, int b){
        this.a=a;
        this.b=b;    
        System.out.println("ini kasus pertama dengan nilai : "+this.a+ " dan  "+this.b); } 
    
    public void contoh(int a, int b, int c){ 
        this.a=a;
        this.b=b;
        this.c=c; 
        System.out .println("ini kasus kedua dengan nilai : "+this.a+ " dan " +this.b+ " dan " +this.c); }  
 
    public void contoh(int x,int y){ 
        this.a=x;
        this.b=y;
        System.out.println("ini kasus ketiga dengan nilai : "+this.a+ " dan " +this.b); } 
    
    public void contoh(String a, int b){  
        this.d=a;
        this.b=b;
        System.out.println("ini kasus keempat dengan nilai : "+this.d+ " dan " +this.b); } 
     
    public void contoh(int b, String a){
        this.d=a;
        this.b=b; 
         System.out.println("ini kasus kelima dengan nilai : "+this.d+ " dan "+this.b); }   

}