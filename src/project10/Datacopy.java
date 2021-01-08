package project10;
import java.util.*;
import java.io.*;
public class Datacopy {
	public static void main(String[] args) {
		DataInputStream cin = new DataInputStream(new FileInputStream("src/DataInputStream/input.txt"));
		DataOutputStream cout = new DataOutputStream(new FileOutputStream("src/DataInputStream/copy.txt"));
		String ths;
		while((ths=cin.readLine())!=null) {
			cout.writeBytes(ths+'\n');
		}
	}

}
