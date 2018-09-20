
package latihan2;

public class UjiBus2 {
    public static void main (String[] args){
        
        //membuat objek busBesar dari kelas Bus2
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
        
        
    }
    
}
