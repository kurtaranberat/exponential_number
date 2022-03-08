import  java.util.Scanner;
public class exponential_number {
       static  int ust (int a ,int b ){
           int result =(int )(Math.pow(a,b ));
           return  result;
       }

    public   static  void main(String[]args){
        Scanner brt=new Scanner(System.in );
        System.out.print("tabanı gırıanız =");
        int a =brt.nextInt();
        System.out.print("üstel sayıyı gırriniz=");
        int b =brt.nextInt();

      System.out.println(ust(a,b));
    }
}
