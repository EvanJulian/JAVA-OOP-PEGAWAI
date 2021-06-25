/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
// sudah
public class WebDeveloper extends Employee implements PHPProgrammer{
    protected WebDeveloper(){
        super();
    }
    protected WebDeveloper(String nama, int umur, int tahunMasuk){
        super(nama, umur, tahunMasuk);
    }
    public void tulisKodeProgramPHP(){
        System.out.println("Web developer sedang menulis kode program");
    }
    @Override
    public long getTunjangan(){
        int tahunBerlalu = 2016-this.tahunMasuk;
        if(tahunBerlalu%2!=0){
            tahunBerlalu-=1;
            return 300000*tahunBerlalu;
        }
        else{
            return 300000*tahunBerlalu;
        }
    }
    @Override
    public String toString(){
        return super.toString() + super.getGajiBulanan() + ".";
    }
}