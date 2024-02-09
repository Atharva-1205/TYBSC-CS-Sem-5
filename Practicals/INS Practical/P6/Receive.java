import java.io.*;
import java.security.*;
public class Receive {
    public static void main(String[] args) {
        byte dig[] = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream("msg.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            String data = (String)obj;
            System.out.println("Recieved Data: "+data);
            obj = ois.readObject();
            dig = (byte[])obj;
 MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data.getBytes());
            if(MessageDigest.isEqual(md.digest(), dig))
            System.out.println(data+" Retrieved Successfully!");
            ois.close();
        } catch (Exception e) {
            System.out.println("Message is corrupted");
        }
    }
}
