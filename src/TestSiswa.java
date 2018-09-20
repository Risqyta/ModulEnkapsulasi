
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Dhiva");
        siswa.setAbsen("17");
        siswa.setAlamat("Surabaya");
        
        System.out.print("Name : "+siswa.getNama()+ " Absen : "+siswa.getAbsen()+ " Address : "+siswa.getAlamat());
        
    }
    
}
