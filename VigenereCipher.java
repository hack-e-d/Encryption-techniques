
//Code to perform Ceaser Cipher Encryption and Decryption
import java.io.*;
import java.util.*;

class VigenereCipher {
    public static void encrypt(String pt, String k) {
        StringBuffer ct = new StringBuffer();
        for (int i = 0; i < pt.length(); i++) {
            if (Character.isUpperCase(k.charAt(i % k.length()))) {
                int key = (int) (k.charAt(i % k.length())) - 65;
                if (Character.isUpperCase(pt.charAt(i))) {
                    char c = (char) (((int) pt.charAt(i) + key - 65) % 26 + 65);
                    ct.append(c);
                } else {
                    char c = (char) (((int) pt.charAt(i) + key - 97) % 26 + 97);
                    ct.append(c);
                }
            } else {
                int key = (int) (k.charAt(i % k.length())) - 97;
                if (Character.isUpperCase(pt.charAt(i))) {
                    char c = (char) (((int) pt.charAt(i) + key - 65) % 26 + 65);
                    ct.append(c);
                } else {
                    char c = (char) (((int) pt.charAt(i) + key - 97) % 26 + 97);
                    ct.append(c);
                }
            }
        }
        System.out.println("The cipher Text=" + ct);
    }

    public static void deencrypt(String pt, String k) {
        StringBuffer ct = new StringBuffer();
        for (int i = 0; i < pt.length(); i++) {
            if (Character.isUpperCase(k.charAt(i % k.length()))) {
                int key = (int) (k.charAt(i % k.length())) - 65;
                if (Character.isUpperCase(pt.charAt(i))) {
                    int tempkey = (int) pt.charAt(i) - key - 65;
                    if (tempkey < 0) {
                        tempkey += 26;
                    }
                    char c = (char) (tempkey % 26 + 65);
                    ct.append(c);
                } else {
                    int tempkey = (int) pt.charAt(i) - key - 97;
                    if (tempkey < 0) {
                        tempkey += 26;
                    }
                    char c = (char) (tempkey % 26 + 97);
                    ct.append(c);
                }
            } else {
                int key = (int) (k.charAt(i % k.length())) - 97;
                if (Character.isUpperCase(pt.charAt(i))) {
                    int tempkey = (int) pt.charAt(i) - key - 65;
                    if (tempkey < 0) {
                        tempkey += 26;
                    }
                    char c = (char) (tempkey % 26 + 65);
                    ct.append(c);
                } else {
                    int tempkey = (int) pt.charAt(i) - key - 97;
                    if (tempkey < 0) {
                        tempkey += 26;
                    }
                    char c = (char) (tempkey % 26 + 97);
                    ct.append(c);
                }
            }
        }
        System.out.println("The cipher Text=" + ct);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text:");
        String pt = s.nextLine();
        System.out.println("Enter the key:");
        String k = s.nextLine();
        int o = 0;
        System.out.println("1.Encrypt\n2.Decrypt\nEnter the choice:");
        o = s.nextInt();
        if (o == 1) {
            encrypt(pt, k);
        } else {
            deencrypt(pt, k);
        }
    }
}