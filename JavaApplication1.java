package javaApplication1;

import com.sun.imageio.plugins.jpeg.JPEG;
import static java.time.Clock.system;
import java.util.Random;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        System.out.println("wiek: "+ wiek());
        System.out.println("masz na imie: "+ imie());
       
        Random rand=new Random();
        int a= rand.nextInt(25)-10;
        int b= rand.nextInt(25)-10;
       
        zadanie3(a,b);
        zadanie3(2,3);
        System.out.println(zadanie4(a));
        System.out.println(zadanie5(a));
        zadanie6(2);
        zadanie7(4);
        System.out.println(zadanie8(5,6,4));
       
       
            }
    //metody
    public static int wiek(){
        return 30;
       
    }
    public static String imie(){
        return "jan";
       
    }
    public static void zadanie3(int a, int b){
     System.out.println("suma: "+a+ "+" +b+"="+(a+b));
     System.out.println("różnica: "+a+ "-" +b+"="+(a-b));
      System.out.println("iloczyn: "+a+ "*" +b+"="+(a*b));  
    }
   public static boolean zadanie4(int a){
       return a %2==0;
      // if (a %2==0) return true;
      //else return false;
   }
   public static boolean zadanie5(int a){
       if (((a%3)==0)&&((a%5)==0)) return true;
       else return false;
   }
   public static void zadanie6(int i){
   System.out.println(Math.pow(i, 3));
   }
   public static void zadanie7(int i){
   System.out.println(Math.sqrt(i));
   }
   public static boolean zadanie8(int a, int b, int c){
   if ((a+b>c)&&(a+c>b)&&(b+c>a))return true;
   else return false;
 
   }
   
}