import java.util.Scanner;

public class Latihan1{
    public static void main(String[] args) {

        
        for(int i=0 ; i<2; i++){
            
            Scanner input = new Scanner(System.in);
            String platNomer="", jenisK="";
            int jamMasuk=0, jamKeluar=0, totalJam=0 , totalBayar=0, hargaAwal=0, hargaNext=0, jenisKendaraan=0;    

            System.out.print("Plat Nomor             :   ");
            platNomer = input.nextLine();
            System.out.print("Jenis Kendaraan (1/2)  :   ");
            jenisKendaraan = input.nextInt();
            System.out.print("Jam Masuk              :   ");
            jamMasuk = input.nextInt();
            System.out.print("Jam Keluar             :   ");
            jamKeluar = input.nextInt();

            if(jamMasuk > jamKeluar){
                totalJam = (jamKeluar - jamMasuk)+24 ;
            }else if(jamMasuk == jamKeluar){
                totalJam = 1;
            }else{
                totalJam = jamKeluar - jamMasuk;
            }
            
            if(jenisKendaraan == 1){
                jenisK = "Mobil";
                hargaAwal = 5000;
                hargaNext = 3000 * (totalJam-1);
                totalBayar = hargaAwal + hargaNext;
            }else if(jenisKendaraan == 2){
                jenisK = "Motor";
                hargaAwal = 3000;
                hargaNext = 1500 * (totalJam-1);
                totalBayar = hargaAwal + hargaNext;
            }else{
                System.out.println("Tidak Terdefinisi");
            }

            System.out.println("");
            System.out.println("Terima kasih telah melakukan transaksi dengan rincian sebagai berikut : ");
            System.out.println("Plat Nomor          :   "+platNomer);
            System.out.println("Jenis Kendaraan     :   "+jenisK);
            System.out.println("Lama Parkir         :   "+totalJam+" jam");
            System.out.println("Total bayar         :   "+totalBayar);
            System.out.println();
            System.out.println("Semoga pelayanan kami memuaskan");
            System.out.println("");
        }
    }

}