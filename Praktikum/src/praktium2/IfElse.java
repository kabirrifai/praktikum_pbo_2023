package praktium2;
import java.util.Scanner;

public class IfElse {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int angka;
		System.out.print("Masukkan Angka : ");
		angka = input.nextInt();
		
		if(angka < 5) {
			System.out.print("Masukkan yang dimasukkan kurang dari 5");
		} else {
			System.out.print("Masukkan yang dimasukkan lebih dari 5");
		}
	}
	
}	
