/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Bus1 {
    public int penumpang;
    public int maxpenumpang;
    private double average,BB,JP;

    public Bus1(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
      public void addpenumpang(int penumpang)
    {int temp;
        temp=this.penumpang+penumpang;
        if (temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password)
    {
        if(password==24)
        { System.out.println("Password Benar");
    }
        else 
        {
            System.out.println("Password Salah");
        }
        
    }
    public void cetakpenumpang()
    {
        System.out.println("penumpang bus sekarang = "+penumpang);
        System.out.println("maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxpenumpang() {
        return maxpenumpang;
    }

    public double getAverage() {
        average= BB/JP;
        System.out.println("Rata Rata  :"+average);
        return average;
    }

    public double getBB() {
        return BB;
    }

    public double getJP() {
        return JP;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxpenumpang(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setBB(double BB) {
        this.BB = BB;
    }

    public void setJP(double JP) {
        this.JP = JP;
    }
    

}

    

