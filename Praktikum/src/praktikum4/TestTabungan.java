package praktikum4;
import java.util.Scanner;

public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukkan jumlah saldo : ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("Saldo awal : "+tabungan.saldo);
		
		System.out.print("Masukkan Saldo penarikan :");
		tariktunai = input.nextInt();
		tabungan.ambiluang(tariktunai);
		System.out.println("Jumlah uang yang diambil : "+tariktunai);
		System.out.println("Saldo sekarang : "+tabungan.saldo);
	}
}
