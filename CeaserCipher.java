
//Code to perform Ceaser Cipher Encryption and Decryption
import java.io.*;
import java.util.*;

class CeaserCipher {
    public static void encrypt(String pt, int k) {
        StringBuffer ct = new StringBuffer();
        for (int i = 0; i < pt.length(); i++) {
            if (Character.isUpperCase(pt.charAt(i))) {
                char c = (char) (((int) pt.charAt(i) + k - 65) % 26 + 65);
                ct.append(c);
            } else {
                char c = (char) (((int) pt.charAt(i) + k - 97) % 26 + 97);
                ct.append(c);
            }
        }
        System.out.println("The cipher Text=" + ct);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text:");
        String pt = s.nextLine();
        System.out.println("Enter the key:");
        int k = 0;
        k = s.nextInt();
        int o = 0;
        System.out.println("1.Encrypt\n2.Decrypt\nEnter the choice:");
        o = s.nextInt();
        if (o == 1) {
            encrypt(pt, k);
        } else {
            encrypt(pt, 26 - k);
        }
    }
}