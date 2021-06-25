/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
// sudah
public class CleaningService extends Employee {
    private String lokasiYangDipertanggungjawabkan;
    
    public CleaningService(){
        super();
        lokasiYangDipertanggungjawabkan = "";
    }
    public CleaningService(String nama, int umur, int tahunMasuk, String lokasiYangDipertanggungjawabkan){
        super(nama, umur, tahunMasuk);
        this.lokasiYangDipertanggungjawabkan = lokasiYangDipertanggungjawabkan;
    }
    public void setLokasiYangDipertanggungjawabkan(String lokasiYangDipertanggungjawabkan){
        this.lokasiYangDipertanggungjawabkan = lokasiYangDipertanggungjawabkan;
    }
    public String getLokasiYangDipertanggungjawabkan(){
        return this.lokasiYangDipertanggungjawabkan;
    }
    @Override
    public long getTunjangan(){
        return 0;
    }
    @Override
    public String toString(){
        return "seorang cleaning service bernama " + nama + " dengan umur " + umur + " yang mulai bekerja dari " + tahunMasuk + " dan memiliki gaji bulanan Rp. " + this.getGajiBulanan() + ". lokasi yang dipertanggungjawabkan : " + this.lokasiYangDipertanggungjawabkan;
    }
}
