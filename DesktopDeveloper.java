/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
//sudah
public class DesktopDeveloper extends Employee implements JavaProgrammer{
    public DesktopDeveloper(){
        super();
    }
    public DesktopDeveloper(String nama,int umur, int tahunMasuk){
        super(nama,umur,3000000,tahunMasuk);
    }
    @Override
    public void tulisKodeProgramJava(){
        System.out.println("Desktop developer sedang menulis kode program Java.");
    }
    @Override
    public void tulisKodeProgram(){
        System.out.println("Desktop developer sedang menulis kode program.");
    }
    @Override
    public long getTunjangan(){
        long hasil=0;
        if(2016==this.tahunMasuk){
            return 100000;
        }
        else{
            hasil = 100000*(2016-this.tahunMasuk);
            return hasil;
        }
    }
    @Override
    public String toString(){
        return super.toString() + super.getGajiBulanan() + ".";
    }
}