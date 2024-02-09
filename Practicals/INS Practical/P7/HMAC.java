import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner;
public class HMAC {
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        String data=sc.nextLine();
            SecureRandom rnd=new SecureRandom();
            byte[] k=new byte[100];
            rnd.nextBytes(k);
            SecretKeySpec key =new SecretKeySpec(k,"HMACSHA1");
            Mac m=Mac.getInstance("HmacSHA1");
            m.init(key);
            m.update(data.getBytes());
            byte[] result=m.doFinal();
        System.out.println("Signature using HMACSHA1:"+new String(result));
    }
}
