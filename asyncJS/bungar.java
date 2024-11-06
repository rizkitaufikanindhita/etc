import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bungar {
    public static void main(String[] args) {
        // Pengucapan Salam
        int jam = LocalDateTime.now().getHour();
        String waktu = null;
        if (jam <= 10){
            waktu = "Pagi";
        } else if (jam > 10 && jam <= 14) {
            waktu = "Siang";
        } else if (jam > 14 && jam < 17){
            waktu = "Sore";
        } else {
            waktu = "Malam";
        }
        System.out.println("\t\tSELAMAT "+ waktu.toUpperCase() +"...");

        // Jumlah Pemesan
        Scanner input = new Scanner(System.in);
        int jmlCust = 0;
        boolean nilai = true;
        while (nilai){
            System.out.printf("%s%3s","\t\tPESAN UNTUK BERAPA ORANG",": ");
            try{
                jmlCust = input.nextInt();
                if (jmlCust < 1){
                    System.out.println("\t\tMasukkan jumlah yang benar");
                } else {
                    nilai = false;
                }
            } catch (Exception num){
                System.out.println("\t\tMasukkan jumlah yang benar");
            }
        }

        // Input Nama Pemesan
        System.out.printf("%s%10s","\t\tPesanan atas nama",": " );
        String nama = input.next();

        // Menu Spesial
        System.out.println();
        System.out.println("\t\tMENU SPESIAL HARI INI");
        String sym = " ".repeat(8);
        System.out.println(sym+"=".repeat(21));

        // Menu Spesial List
        String[] menu = {
                "1. Nasi Goreng Spesial",
                "2. Ayam Goreng Spesial",
                "3. Steak Sirloin Spesial",
                "4. Kwetiaw Siram Spesial",
                "5. Kambing Guling Spesial"
        };
        double[] harga = {
                9999.99,
                12345.67,
                21108.40,
                13579.13,
                98765.43
        };
        for (int i = 0; i < menu.length;i++){
            System.out.printf("\t\t%-50s @   Rp. %10.2f %n",menu[i],harga[i]);
        }

        // Input Jumlah Rincian Pesanan
        System.out.println();
        System.out.println("Pesanan Anda [batas pesanan 0 - 10 porsi]".toUpperCase());
        List<Integer> rinc = new ArrayList<Integer>();
        for (int i = 0; i < menu.length;i++){
            System.out.printf("%-30s = ",menu[i]);
            int num = input.nextInt();
            rinc.add(num);
        };

        // Menikmati makanan
        System.out.println();
        System.out.println("SELAMAT MENIKMATI MAKANAN ANDA...");
        Scanner enter = new Scanner(System.in);
        System.out.println("...press ENTER to continue...");
        enter.nextLine();

        // Pembelian
        System.out.println("pembelian".toUpperCase());
        List<Double> total = new ArrayList<Double>();
        for (int i = 0; i < menu.length-1; i++){
            total.add(rinc.get(i)*harga[i]);
            System.out.printf("%-30s%2d porsi * Rp. %10.2f = Rp. %15.2f %n",menu[i],rinc.get(i),harga[i],total.get(i));
        }
        int u = menu.length-1;
        total.add(rinc.get(u)*harga[u]);
        System.out.printf("%-30s%2d porsi * Rp. %10.2f = Rp. %15.2f + %n",menu[u],rinc.get(u),harga[u],total.get(u));
        System.out.println("=".repeat(80));

        // Total Pembelian
        double sum = 0;
        for (int v = 0; v < total.size();v++){
            sum += total.get(v);
        }
        System.out.printf("%-55s = Rp. %15.2f %n","total pembelian".toUpperCase(),sum);

        // disc 10%
        double disc = sum * 0.10;
        System.out.printf("%-55s = Rp. %15.2f - %n","Disc. 10% <Masa Promosi>".toUpperCase(),disc);
        System.out.println("=".repeat(80));

        // total pembelian setelah disc
        double toAfterDisc = sum - disc;
        System.out.printf("%-55s = Rp. %15.2f %n","Total Pembelian setelah disc 10%".toUpperCase(),toAfterDisc);

        // pembelian per orang
        double perOrang = toAfterDisc/jmlCust;
        String personal = "pembelian per orang <untuk "+jmlCust+ " orang>".toUpperCase();
        System.out.printf("%-55s = Rp. %15.2f %n",personal,perOrang);

        // closing
        System.out.println();
        System.out.println("\t\t\t\t\tTerima kasih atas kunjungan anda".toUpperCase());
        System.out.println("\t\t\t\t\t...tekan Enter untuk keluar...");
        enter.nextLine();

    }
}
