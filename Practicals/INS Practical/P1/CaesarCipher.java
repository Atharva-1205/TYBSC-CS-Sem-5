import java.util.Scanner;
public class CaesarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data to encrypt");
		String str = sc.nextLine();
		System.out.println("Input the key length");
		int key = sc.nextInt();
		String encrypted = encrypt(str, key);
		System.out.println("Encryped Test is :" + encrypted);
		String decrypted = decrypt(encrypted, key);
		System.out.println("Decrypted:" + decrypted);
	}
	public static String encrypt(String str, int key) {
		String ct = "";
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				c = c + (key % 26);
				if (c > 'Z')
					c = c - 26;
			} else if (Character.isLowerCase(c)) {
				c = c + (key % 26);
				if (c > 'z')
					c = c - 26;
			}
			ct += (char) c;
		}
		return ct;
	}
	public static String decrypt(String str, int key) {
		String pt = "";
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				c = c - (key % 26);
				if (c < 'A')
					c = c + 26;
			} else if (Character.isLowerCase(c)) {
				c = c - (key % 26);
				if (c < 'a')
					c = c + 26;
			}
			pt += (char) c;
		}
		return pt;
	}
}
