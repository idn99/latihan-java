import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Latihan2{
    public static void main(String[] args) {

        for(int i=0;i<2;i++){

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(isr);

            String namaPemesan=" ", kelas=" ", rute=" ";
            int rateBis=0, jmlKursi=0, hargaSatuan=0, totalBayar=0;

            try {
                System.out.print("Nama Pemesan     :    ");
                namaPemesan = input.readLine();
                System.out.print("Rate Bis(1/2/3)  :    ");
                rateBis = Integer.parseInt(input.readLine());
                System.out.print("Kelas(AC/NA)     :    ");
                kelas = input.readLine();
                System.out.print("Jumlah Kursi     :    ");
                jmlKursi =  Integer.parseInt(input.readLine());
            } catch (IOException e) {
            }

            switch(rateBis){
                case 1 :
                rute = "Jakarta - Bandung";
                if(kelas.equalsIgnoreCase("na")){
                    hargaSatuan = 90000;
                    
                }else if(kelas.equalsIgnoreCase("ac")){
                    hargaSatuan = 130000;
                }
                break;

                case 2:
                rute = "Bandung - Jakarta";
                if(kelas.equalsIgnoreCase("na")){
                    hargaSatuan = 70000;
                }else if(kelas.equalsIgnoreCase("ac")){
                    hargaSatuan = 150000;
                }
                break;

                case 3:
                rute = "Jakarta - Tasikmalaya";
                if(kelas.equalsIgnoreCase("na")){
                    hargaSatuan = 50000;
                }else if(kelas.equalsIgnoreCase("ac")){
                    hargaSatuan = 70000;
                }
                break;
                default : System.out.println("Rate bis yang anda masukan salah") ;
            }
            totalBayar = hargaSatuan * jmlKursi;

            System.out.println();
            System.out.println("Terima kasih telah memesan tiket bis dengan rincian sebagai berikut : ");
            System.out.println("Nama Pemesan        :   "+namaPemesan);
            System.out.println("Rute                :   "+rute);
            System.out.println("Kelas               :   "+kelas);
            System.out.println("Jumlah Kursi        :   "+jmlKursi);
            System.out.println("Harga Satuan        :   "+hargaSatuan);
            System.out.println("Total bayar         :   "+totalBayar);
            System.out.println();
            System.out.println("Silahkan membayar di Alfamart Terdekat");
            System.out.println();
        }
    }
}