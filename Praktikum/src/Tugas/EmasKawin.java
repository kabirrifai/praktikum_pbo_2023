package Tugas;

public class EmasKawin {
	private double hargaEmasPerGram;
	private double beratEmas;
	
	public EmasKawin(double hargaEmasPerGram, double beratEmas) {
		this.hargaEmasPerGram = hargaEmasPerGram;
		this.beratEmas = beratEmas;
	}
	
	public double hitungTotalBiaya() {
		return hargaEmasPerGram * beratEmas;
	}
	public static void main(String[] args) {
		double hargaEmasPerGram = 570000;
		double beratEmas = 15.7;
		
		EmasKawin hendi = new EmasKawin(hargaEmasPerGram, beratEmas);
		
		double totalBiaya = hendi.hitungTotalBiaya();
		
		System.out.println("Total biaya yang harus dikeluarkan oleh Hendi adalah: Rp" + totalBiaya);
	}
}
