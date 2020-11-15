import java.util.Scanner;

class TagihanPLN extends Pelanggan{
	
	private int bayar;
	private int harga;
	private int kembalian;
	
    void proses(){
    	
    	boolean loop = true;
		harga=0;
		
		Scanner input = new Scanner(System.in);
				
		while(loop)
    	{
    		System.out.print("Masukkan Tipe Rumah (36/37) : ");
			tipe = input.nextByte();
    		switch(tipe)
	    	{
	    		case 36 :
	    			System.out.print("Masukkan Blok Rumah (A/B) : ");
					blok = input.next().charAt(0);
              		if (blok == 'A' || blok == 'a'){
              			harga = 500000;
              		}
              		else if (blok == 'B' || blok == 'b'){
              			harga = 300000;
              		}
              		else{
              			System.out.println("Blok rumah yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;              			
              		}
              		              		
	    			loop = false;
	    			break;
	    			
	    		case 37 :
              		if (blok == 'A' || blok == 'a'){
              			harga = 800000;
              		}
              		else if (blok == 'B' || blok == 'b'){
              			harga = 600000;
              		}
              		else{
              			System.out.println("Blok rumah yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;            			
              		}
              		
	    			loop = false;
	    			break;
	    			
	    		default :
	    			System.out.println("Tipe rumah yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
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