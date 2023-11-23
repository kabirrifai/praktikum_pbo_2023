package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String namaKucing, warnaKucing;
		int beratkucing;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Kucing : ");
		namaKucing = input.next();
		
		System.out.print("Masukkan Warna Kucing : ");
		warnaKucing = input.next();
		
		System.out.print("Masukkan Berat Kucing : ");
		beratkucing = input.nextInt();
		
		Cat kucingSaya = new Cat();
		kucingSaya.identitas(namaKucing, warnaKucing, beratkucing);
		System.out.println("Kucing "+kucingSaya.name
				+" Warnanya "+kucingSaya.ambilWarna()
				+" Beratnya "+kucingSaya.ambilBerat());
		kucingSaya.eat();
	}
}	
