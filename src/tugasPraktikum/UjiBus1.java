/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

import latihan3.Bus3;

/**
 *
 * @author ASUS
 */
public class UjiBus1 {
     public static void main(String[]abc)
    {
       Bus1 Bus = new Bus1 (5);
       Bus.getpenumpang(17);
       Bus.getpenumpang(24);
       Bus.cetakpenumpang();
       
    //penambahan penumpang
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    //penambahan penumpang
    Bus.addpenumpang(1);
    Bus.cetakpenumpang();
    //penambahan penumpang
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    Bus.setBB(10);
    Bus.setJP(2);
    Bus.getAverage();
}
}
