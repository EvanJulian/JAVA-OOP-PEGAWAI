/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
// Sudah
public class Accountant extends Employee{
    private String noRekYangDipertanggungjawabkan;

    public Accountant(){
        super();
        noRekYangDipertanggungjawabkan = "";
    }
    public Accountant(String nama, int umur, int tahunMasuk, String noRekYangDipertanggungjawabkan){
        super(nama, umur, tahunMasuk);
        this.noRekYangDipertanggungjawabkan = noRekYangDipertanggungjawabkan;
    }
    public void setNoRekYangDipertanggungjawabkan(String noRekYangDipertanggungjawabkan){
        this.noRekYangDipertanggungjawabkan = noRekYangDipertanggungjawabkan;
    }
    public String getNoRekYangDipertanggungjawabkan(){
        return this.noRekYangDipertanggungjawabkan;
    }
    @Override
    public long getTunjangan(){
        return 500000;
    }
    @Override
    public String toString(){
        return "seorang accountant bernama " + nama + " dengan umur " + umur + " yang mulai bekerja dari " + tahunMasuk + " dan memiliki gaji bulanan Rp. " + this.getGajiBulanan() + ". no.rek yang dipertanggungjawabkan : " + Integer.parseInt(this.noRekYangDipertanggungjawabkan);
    }
}
