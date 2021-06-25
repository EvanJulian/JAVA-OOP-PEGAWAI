/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
//sudah
public abstract class Employee {
    protected String nama;
    protected int umur;
    protected long gajiPokok;
    protected int tahunMasuk;

    protected Employee(){
        nama = "";
        umur = 0;
        gajiPokok = 0;
        tahunMasuk = 0;
    }
    protected Employee(String nama, int umur, long gajiPokok, int tahunMasuk){
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tahunMasuk = tahunMasuk;
    }
    protected Employee(String nama, int umur, int tahunMasuk){
        this(nama, umur, 2000000, tahunMasuk);
    }
    protected void setUmur(int umur){
        this.umur = umur;
    }
    protected void setNama(String nama){
        this.nama = nama;
    }
    protected void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    protected void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    protected int getUmur(){
        return this.umur;
    }
    protected String getNama(){
        return this.nama;
    }
    protected int getTahunMasuk(){
        return this.tahunMasuk;
    }
    protected long getGajiPokok(){
        return this.gajiPokok;
    }
    protected long getGajiBulanan(){
        return this.gajiPokok+getTunjangan();
    }
    protected abstract long getTunjangan();
    @Override
    public String toString(){
        String tot ="";
        tot+= "Seorang dekstop developer bernama " + this.nama;
        tot+= " dengan umur " + this.umur;
        tot+= " yang mulai bekerja dari " + this.tahunMasuk;
        tot+= " dan memiliki gaji bulanan Rp. ";
        return tot;
    }
}
