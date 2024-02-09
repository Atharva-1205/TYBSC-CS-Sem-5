import java.io.*;
import java.security.*;
import java.util.Scanner;
public class Send {
    public static void main(String[] args) {
        System.out.println("Enter the message to be send: ");
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            byte buffer[] = new byte[input.length()];
            FileOutputStream fos = new FileOutputStream("msg.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            MessageDigest md = MessageDigest.getInstance("MD5");
            buffer = input.getBytes();
            md.update(buffer);
            oos.writeObject(input);
            oos.writeObject(md.digest());
            System.out.println("Message send successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }   
}
