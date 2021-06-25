/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
// sudah
import java.util.*;
public class ExperiencedWebDeveloper extends WebDeveloper implements WebExperience, ProjectHandler {
    List<String> handledProject;
    public ExperiencedWebDeveloper(String nama, int umur, int tahunMasuk){
        super(nama,umur,tahunMasuk);
        handledProject = null;   
    }
    @Override
    public long getGajiBulanan(){
        return (2*gajiPokok)+this.getTunjangan();
    }

    public void setHandledProject(List<String> handledProject){
        this.handledProject = handledProject;
    }
    public String getProyekYangSedangDikerjakan(){
        String hasil = "";
        for(String value : handledProject){
            hasil += value + ", ";
        }
        return hasil;
    }
    public String getProyekYangSedangDikerjakan(int idx){
        return handledProject.get(idx);
    }
    public void addHandledProject(String projectName){
        boolean kondisi = false;
        for(String value : handledProject){
            if (value.equals(projectName)){
                kondisi = false;
            }
            else{
                kondisi = true;
            }
        }
        if(kondisi == true){
            handledProject.add(projectName);
        }
        else{
            //nothing
        }
    }
    public void addHandledProject(List<String> projectNameList){
        for(String value : projectNameList){
            boolean kondisi =false;
            String masuk = "";
            for(String value1 : handledProject){
                if(value.equals(value1)){
                    kondisi = false;
                }
                else{
                    kondisi = true;
                    masuk = value;
                }
            }
            if(kondisi == true){
                handledProject.add(masuk);
            }
        }
    }
    public void removeHandledProject(){
        for (String value : handledProject){
            handledProject.remove(value);
        }
    }
    public void removeHandledProject(int idx){
        handledProject.remove(idx);
    }
    public void removeHandledProject(String projectName){
        boolean kondisi = false;
        for(String value : handledProject){
            if (value.equals(projectName)){
                kondisi = false;
            }
            else{
                kondisi = true;
            }
        }
        if(kondisi == false){
            handledProject.remove(projectName);
        }
        else{
            //nothing
        }
    }
    public boolean cariHandledProjectTertentu(String projectName){
        boolean kondisi = false;
        for(String value : handledProject){
            if (value.equals(projectName)){
                kondisi = true;
            }
            else{
                kondisi = false;
            }
        }
        return kondisi;
    }
    @Override
    public long getTunjangan(){
        int tahunBerlalu = 2016-this.tahunMasuk;
        if(tahunBerlalu%2!=0){
            tahunBerlalu-=1;
            return 1200000*tahunBerlalu;
        }
        else{
            return 1200000*tahunBerlalu;
        }
    }
    @Override
    public String toString(){
        return "Seorang web developer berpengalaman bernama " + this.nama + " dengan umur " + this.umur + " yang mulai bekerja dari " + this.tahunMasuk + " dan memiliki gaji bulanan Rp. " + this.getGajiBulanan() +".";
    }
}
