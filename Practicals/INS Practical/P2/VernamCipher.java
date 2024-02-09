import java.util.Scanner;
public class VernamCipher{
    public static void main(String[] args) {
        String text,key,output="",dec="";
        char t,k;
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter text to Encrypt/Decrypt:");
        text=s.nextLine().toLowerCase();
        System.out.println("Enter key of length "+text.length());
        key=s.nextLine().toLowerCase();
        for(int i=0;i<text.length();i++){
            t=text.charAt(i);
            k=key.charAt(i);
            x=t^k;
            output+=(char)(x+96);
        }
        System.out.println("Encrypted Text is:"+output);
        for(int i=0;i<output.length();i++){
            t=output.charAt(i);
            k=key.charAt(i);
            x=t^k;
            dec+=(char)(x+96);
        }
        System.out.println("Decrypted Text is:"+dec);
    }
}