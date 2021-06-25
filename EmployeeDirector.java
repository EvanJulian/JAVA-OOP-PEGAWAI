/**
 *
 * @author Evan Julian Sudarman - 2073008
 * --Version 12/04/2021
 */
import java.util.*;
import static java.lang.System.*;
public class EmployeeDirector {
    public EmployeeDirector(){
        Scanner sc= new Scanner(in);
        out.print("Masukan Jumlah Employee : ");
        int jmlEmployee = sc.nextInt(); 
        List<Employee> arrayEmployees =new ArrayList<Employee>();
        for(int i = 0; i<jmlEmployee;i++){
            out.println("Selamat Datang");
            out.println("Silahkan Pilih Jenis Employee");
            out.println("1. Cleaning Service");
            out.println("2. Accountant");
            out.println("3. Desktop Developer");
            out.println("4. Experienced Desktop Developer");
            out.println("5. Web Developer");
            out.println("6. Experienced Web Developer");
            String nama, lokasiYangDipertanggungjawabkan, projectName, noRekYangDipertanggungjawabkan;
            int umur, tahunMasuk, mode;
            out.print("Pilihan : ");
            mode = sc.nextInt();
            if(mode == 1){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                out.print("Dimana Lokasi Tempat Anda Bertanggung Jawab : ");
                lokasiYangDipertanggungjawabkan = sc.next();
                arrayEmployees.add(new CleaningService(nama, umur, tahunMasuk, lokasiYangDipertanggungjawabkan));
            }
            else if(mode == 2){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                out.print("No.Rekening yang dipercayakan : ");
                noRekYangDipertanggungjawabkan = sc.next();
                arrayEmployees.add(new Accountant(nama, umur, tahunMasuk, noRekYangDipertanggungjawabkan));
            }
            else if(mode==3){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                arrayEmployees.add(new DesktopDeveloper(nama, umur, tahunMasuk));
            }
            else if(mode==4){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                out.print("Project yang sedang dikerjakan : ");
                projectName = sc.next();
                ExperiencedDesktopDeveloper e = new ExperiencedDesktopDeveloper(nama, umur, tahunMasuk);
                arrayEmployees.add(e);
                e.setHandledProject(projectName);
            }
            else if(mode==5){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                arrayEmployees.add(new WebDeveloper(nama, umur, tahunMasuk));
            }
            else if(mode==6){
                out.print("Masukan Nama Anda : ");
                nama = sc.next();
                out.print("Masukan Umur Anda : ");
                umur =sc.nextInt();
                out.print("Masukan Tahun Masuk : ");
                tahunMasuk = sc.nextInt();
                out.print("Project yang sedang dikerjakan : ");
                projectName = sc.next();
                ExperiencedWebDeveloper e = new ExperiencedWebDeveloper(nama, umur, tahunMasuk);
                arrayEmployees.add(e);
                e.addHandledProject(projectName);
            }
        }
        out.println("Data employee : ");
        for(Employee a : arrayEmployees){
            if (a != null) {
                out.println(a);
            }
        }
    }
    public static void main(String[] args){
        new EmployeeDirector();
    }
}
