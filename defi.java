import java.util.*;
import java.io.*;
public class defi
{
    public static void main(String ars[])
    {
        int q,xa=8,ya,a,k,xb=4;
        System.out.println("Enter the value of q and alpha:");
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        a=sc.nextInt();
        double temp=Math.pow(a,xa);
        ya=(int)temp%q;
        temp=Math.pow(ya,xb);
        k=(int)temp%q;
        System.out.println("The key is :"+k);
    }
}