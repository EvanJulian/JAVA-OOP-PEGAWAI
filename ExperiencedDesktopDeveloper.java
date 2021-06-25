/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
// sudah
public class ExperiencedDesktopDeveloper extends DesktopDeveloper implements DesktopExperience, ProjectHandler{
    private String handledProject;
    public ExperiencedDesktopDeveloper(String nama, int umur, int tahunMasuk){
        super(nama,umur,tahunMasuk);
        handledProject = "";   
    }
    @Override
    public long getGajiBulanan(){
        return (2*gajiPokok)+this.getTunjangan();
    }

    public void setHandledProject(String projectName){
        this.handledProject = projectName;
    }
    @Override
    public String getProyekYangSedangDikerjakan(){
        return this.handledProject;
    }

    public void removeHandledProject(){
        this.handledProject = "";
    }
    @Override
    public long getTunjangan(){
        return 500000*(2016-this.tahunMasuk);
    }
    @Override
    public String toString(){
        return "Seorang desktop developer berpengalaman bernama " + this.nama + " dengan umur " + this.umur + " yang mulai bekerja dari " + this.tahunMasuk + " dan memiliki gaji bulanan Rp. " + this.getGajiBulanan() +"." +"\nproyek yang dikerjakan : "+this.getProyekYangSedangDikerjakan();
    }
}