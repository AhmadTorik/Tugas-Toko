/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author ASUS
 */
public class Manager extends Karyawan {
    double tunjanganjabatan=2000000;
 String bagian;
 int kehadiran;
 double Tunjangankehadiran;
 double gaji;
 String golongan;
 double Tunjangangolongan;

 public void setTunjanganjabatan(double tunjanganjabatan)
 {
  this.tunjanganjabatan=tunjanganjabatan;
 }
 public double getTunjanganjabatan()
 {
  return tunjanganjabatan;
 }
 public void setGolongan(String golongan)
 {
  this.golongan=golongan;
  switch(golongan.charAt(0)){
   case '1':this.gaji=500000;
     break;
   case '2':this.gaji=1000000;
     break;
   case '3':this.gaji=1500000;
     break;
  }
 }
 public String getGolongan()
 {
  return golongan;
 }
 public double getTunjangangolongan()
 {
  return Tunjangangolongan;
 }
 public void setTunjangangolongan(double Tunjangangolongan)
 {
  this.Tunjangangolongan=Tunjangangolongan;
 }

 public void setkehadiran(int kehadiran)
 {
  this.kehadiran=kehadiran;
 }
 public int getkehadiran()
 {
  return kehadiran;
 }
  public void setTunjangankehadiran(double tunjangankehadiran)
 {
  this.Tunjangankehadiran=kehadiran*10000;
 }
 public double getTunjangankehadiran()
 {
  return Tunjangankehadiran=kehadiran*10000;
 }
 public void setBagian(String bagian)
 {
  this.bagian=bagian;
 }
 public String getBagian()
 {
  return bagian;
 } 
  public void gaji(double tunjangankehadiran,double tunjangangolongan,double tunjanganjabatan)
 {
  this.gaji=Tunjangankehadiran+Tunjangangolongan+tunjanganjabatan;
 }
 public double getgaji()
 {
  return gaji = Tunjangangolongan+Tunjangankehadiran+tunjanganjabatan;
 }

 public void lihatInfo()
 {
  System.out.println("Output class Manajer");
  System.out.println("=================================================");
  System.out.println("Manager  :"+this.getBagian());
  System.out.println("-------------------------------------------------");
  System.out.println("NIK  :"+this.getNik());
  System.out.println("Nama  :"+this.getNama());
  System.out.println("Golongan :"+this.getGolongan());
  System.out.printf("Tunjangangolongan :%.0f\n",this.getTunjangangolongan());
  System.out.printf("TunjanganJabatan :%.0f\n",this.getTunjanganjabatan());
  System.out.println("Jml kehadiran :"+this.getkehadiran());
  System.out.printf("Tunjangankehadiran :%.0f\n",this.getTunjangankehadiran());
  System.out.printf("Gaji  :%.0f\n",this.getgaji());
  System.out.println("-------------------------------------------------");
  System.out.println("=================================================");
 }

}
