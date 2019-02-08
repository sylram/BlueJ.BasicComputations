 
import java.util.Scanner;

public class ShortCalculator {
    public static void calculator(int a, int b){
        /*Scanner num = new Scanner(System.in);
        Short entry = num.nextShort();
        System.out.println(entry);*/
        short x = (short) (a);
        short y = (short) (b);
        
        if(a< 65535 && b <65535)
        {
         System.out.println((short)(x+y));
         System.out.println((short)(x-y));
         System.out.println((short)(x*y));
         System.out.println((short)(x/y));
         System.out.println((short)(x%y));
        }else{
        System.out.println("Number out of range");};
    }
    
       /* public String printIntegerAsBinary(int value){
        
        return Integer.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    public static void main(String[] args){

    }*/
}
    

