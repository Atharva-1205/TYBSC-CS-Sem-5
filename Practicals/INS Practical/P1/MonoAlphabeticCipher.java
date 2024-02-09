import java.util.*;
public class MonoAlphabeticCipher {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter plaintext:");
		String plaintext=sc.nextLine();
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<Integer> p=new ArrayList();
		for(int i=0;i<26;i++)
			p.add(i);
		for(int i=0;i>26;i++)
		{
			System.out.print(p.get(i)+"");
		}
		Collections.shuffle(p);
		for(int i=0;i<26;i++)
		{
			System.out.print(p.get(i)+"");
		}
		String key="",KEY="";
		for(int i=0;i<26;i++)
		{
			key+=lower.charAt(p.get(i));
			key+=upper.charAt(p.get(i));
		}
		String ciphertext="";
		int i,j;
		for(i=0;i<plaintext.length();i++)
		{
			for(j=0;j<lower.length();j++)
			{
				if(plaintext.charAt(i)==lower.charAt(j))
				{
					ciphertext+=key.charAt(j);
					break;
				}
				if(plaintext.charAt(i)==upper.charAt(j))
				{
					ciphertext+=KEY.charAt(j);
					break;
				}
			}
			if(j==upper.length())
				ciphertext+=plaintext.charAt(i);
		}
		String decrtptedtext="";
		i=0;j=0;
		for(i=0;i<ciphertext.length();i++)
		{
			for(j=0;j<key.length();j++)
			{
				if(ciphertext.charAt(i)==key.charAt(j))
				{
					decrtptedtext+=lower.charAt(j);
					break;
				}
				if(ciphertext.charAt(i)==key.charAt(j))
				{
					decrtptedtext+=upper.charAt(j);
					break;
				}
			}
			if(j==KEY.length())
				decrtptedtext+=ciphertext.charAt(i);
		}
		System.out.println("nMonoAlphabetic Cipher");
		System.out.println("plain text:"+plaintext);
		System.out.println("key        :"+key);
		System.out.println("KEY         :"+KEY);
		System.out.println("Cipher Text  :"+ciphertext);
		System.out.println("Decrypted text:"+decrtptedtext);
	}
}
