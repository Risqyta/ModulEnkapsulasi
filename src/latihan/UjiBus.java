
package latihan;

public class UjiBus {
    public static void main(String[] args){
        //membuat object busMini dari kelas Bus
        Bus busMini = new Bus();
        //memasukan nilai jumlah penumpang dan penumpang maksimal ke dalam objek bus mini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        // menambah jumlah jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang+5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        // mengurangi jumlah jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang-2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        // menambah jumlah jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang+8;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
    }
    
}



