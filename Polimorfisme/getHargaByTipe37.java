import java.util.Scanner;

class getHargaByTipe37 extends Pelanggan{
	
	private int bayar;
	private int harga;
	private int kembalian;
	
    void proses(){
    	
		harga=0;
		
		Scanner input = new Scanner(System.in);			

		System.out.print("Masukkan Blok Rumah (A/B) : ");
		blok = input.next().charAt(0);
			
        if (blok == 'A' || blok == 'a'){
              harga = 800000;
        }
        else if (blok == 'B' || blok == 'b'){
              harga = 600000;
        }
        else{
              System.out.println("Blok rumah yang anda pilih tidak ada!!!.");
              System.out.println("");
        }	
	}
	
    public int getHarga(){
        return harga;
    }
    
    public void setBayar(int bayar){
		this.bayar = bayar;
	}
    
    public int getBayar(){
        return bayar;
    }    
    
    public void setKembalian(int bayar){
		kembalian = bayar - harga;
	}
	
	public int getKembalian(){
		return kembalian;
	}
    
    public void showStruk(){
 
        System.out.println("\n\n     Struk Pembayaran PLN      ");
        System.out.println("===============================");
        System.out.println("Nama Pelanggan        : " +getNama());
        System.out.println("Alamat Pelanggan      : " +getAlamat());
        System.out.println("=================================");
        System.out.println("Harga Bayar           : Rp." +getHarga());
        System.out.println("Uang Pembayaran       : Rp." +getBayar());
        System.out.println("Kembalian             : Rp." +getKembalian());
    }
}