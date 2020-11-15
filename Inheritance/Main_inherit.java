import java.util.Scanner;

public class Main_inherit{
	public static void main(String[]args){
	
		TagihanPLN t = new TagihanPLN(); 		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tipe      Blok         Harga   ");
		System.out.println(" 36        A       Rp. 500.000 ");
		System.out.println(" 36   	   B       Rp. 300.000 ");
		System.out.println(" 37  	   A       Rp. 800.000 ");
		System.out.println(" 37   	   B	   Rp. 600.000 ");
		System.out.println("");
		
		System.out.print("Masukkan Nama Anda : ");
		String nama = input.nextLine();
		t.setNama(nama);
		
		System.out.print("Masukkan Alamat Anda : ");
		String alamat = input.nextLine();
		t.setAlamat(alamat);
					
		t.proses();
		System.out.println("Harga bayar : Rp."+ t.getHarga());
		
		System.out.print("Masukkan Jumlah Bayar : Rp.");
		int bayar = input.nextInt();
		
		t.setBayar(bayar);
				
		t.setKembalian(bayar);
		t.getKembalian(); 		
		t.showStruk();
		
	}
}