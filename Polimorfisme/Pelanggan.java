class Pelanggan{
	
	private String nama, alamat;
	protected byte tipe;
	protected char blok;

	public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
		this.nama = nama;
	}	
 
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
		this.alamat = alamat;
	}
 	
 	void proses(){
		System.out.println("Informasi Tagihan Pelanggan " +this.nama + " " +this.alamat);
	}
	
    public int getTipe(){
        return tipe;
    }
    
    public void setTipe(byte tipe){
		this.tipe = tipe;
	}
 
    public char getBlok(){
        return blok;
    }
    
    public void setBlok(char blok){
		this.blok = blok;
	}
}