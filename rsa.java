import java.io.*;
import java.lang.*;
import java.util.*;
public class rsa
{
    public static void main(String a[]) 
    {
        int p,q,e,m,d=1;
        int pn,n,c;
        System.out.println("Enter the value of p and q :");
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        pn=((p-1)*(q-1));
        System.out.println("Enter the value of e: ");
        e=sc.nextInt();
        n=p*q;
        for (int i=0;i<n;i++){
            if((e*i)%pn==1){
                d=i;
                break;
            }
        }
        System.out.println("Enter the message: ");
        m=sc.nextInt();
        double temp=Math.pow(m, e);
        c=(int)(temp%n);
        System.out.println("The cipher : "+c);
        int q1=(int)d/5;
        int r1=(int)d%5;
        double temp1=Math.pow(c,5);
        int temp2=(int)(temp1%n);
        temp1=Math.pow(temp2,q1);
        temp2=(int)(temp1%n);
        double temp3=Math.pow(c,r1);
        int temp4=(int)(temp3%n);
        temp2=temp2*temp4;
        m=(int)(temp2%n);
        System.out.println("The original Message: "+m);


    }
}