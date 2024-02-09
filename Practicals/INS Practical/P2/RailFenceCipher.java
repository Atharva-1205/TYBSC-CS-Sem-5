import java.util.*;
public class RailFenceCipher{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ct="";
        String x="x";
        String first="";
        String last="";
        String dt="";
        String result="";
        int flag=0;
        System.out.println("Enter plain text:");
        String pt=sc.nextLine();
        if(pt.length()%2==1){
            pt=pt.concat(x);
            flag=1;
        }
        System.out.println("Plain Text of even length:"+pt);
        for(int i=0;i<pt.length();i=i+2){
            ct+=pt.charAt(i);
            first+=pt.charAt(i);
        }
         for(int i=1;i<pt.length();i=i+2){
            ct+=pt.charAt(i);
            last+=pt.charAt(i);
        }
        int mid=ct.length()/2;
        System.out.println("mid:"+mid);
        System.out.println("first:"+first);
        System.out.println("last:"+last);
        System.out.println("CipherText:"+ct);
        int i=0;
        while(i<mid){
            dt+=first.charAt(i);
            dt+=last.charAt(i);
            i=i+1;
        }
        if(flag==1){
            result=dt.substring(0,dt.length()-1);
            System.out.println("Decrypted Text:"+result);
        }
        else{
            System.out.println("Decrypted Text:"+dt);
        }
    }
}
