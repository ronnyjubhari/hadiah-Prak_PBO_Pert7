import java.util.Scanner;

public class Main_poly{
	public static void main(String[]args){		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tipe      Blok         Harga   ");
		System.out.println(" 36        A       Rp. 500.000 ");
		System.out.println(" 36   	   B       Rp. 300.000 ");
		System.out.println(" 37  	   A       Rp. 800.000 ");
		System.out.println(" 37   	   B	   Rp. 600.000 ");
		System.out.println("");
		
		System.out.print("Masukkan Nama Anda : ");
		String nama = input.nextLine();
	
		
		System.out.print("Masukkan Alamat Anda : ");
		String alamat = input.nextLine();
		
		
		System.out.print("Masukkan Tipe Rumah (36/37) : ");;
		byte tipe = input.nextByte();
		
		switch (tipe) {
			case 36: 
				getHargaByTipe36 a1 = new getHargaByTipe36();
				a1.setNama(nama);
				a1.setAlamat(alamat);
				a1.setTipe(tipe);
				a1.proses();
				
				System.out.println("Harga bayar : Rp."+ a1.getHarga());
		
				System.out.print("Masukkan Jumlah Bayar : Rp.");
				int bayar = input.nextInt();		
				a1.setBayar(bayar);
				
				a1.setKembalian(bayar);
				a1.getKembalian(); 		
				a1.showStruk();
			break;
			
			case 37: 
				getHargaByTipe37 b1 = new getHargaByTipe37();
				b1.setNama(nama);
				b1.setAlamat(alamat);
				b1.setTipe(tipe);
				b1.proses();
				
				System.out.println("Harga bayar: Rp."+ b1.getHarga());
		
				System.out.print("Masukkan Jumlah Bayar : Rp.");
				bayar = input.nextInt();		
				b1.setBayar(bayar);
				
				b1.setKembalian(bayar);
				b1.getKembalian(); 		
				b1.showStruk();
			break;
			
			default :
	    			System.out.println("Tipe rumah yang anda pilih tidak ada!!!.");
	    			System.out.println("");
	    			break;
		}		
	}
}