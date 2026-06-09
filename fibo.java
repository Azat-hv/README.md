import java.math.BigInteger;
import java.util.Scanner;
public class fibo {
    static BigInteger bef=BigInteger.ZERO;
    public static void fibonaci(int n,BigInteger f,int j)
    { 
        if (n<j)
            return  ;
        System.out.print(bef+" ");
        bef=f.subtract(bef);
        BigInteger yeniF = f.add(bef);
        fibonaci(n,yeniF,j+1);

    }
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        fibonaci(n,BigInteger.ONE,0);
    }
    
}
