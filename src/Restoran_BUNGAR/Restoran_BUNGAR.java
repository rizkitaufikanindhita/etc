package Restoran_BUNGAR;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restoran_BUNGAR {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.println("\t\tSelamat Siang....");
        Scanner input = new Scanner(System.in);
        System.out.print("\t\tPesan untuk berapa orang :");
        int jumlah = input.nextInt();
        System.out.print("\t\tPesanan atas nama :");
        String nama = input.next();
        System.out.println("\t\tMenu Special Hari Ini");
        System.out.println("\t\t=====================");
        String simbol = "@ Rp.";
        String menu1 = "\t\t1. Nasi Goreng Spesial", menu2 = "\t\t2. Ayam Bakar Spesial",
                menu3 = "\t\t3. Steak Sirloin Spesial",menu4 = "\t\t4. Kwetiaw Siram Spesial",
                menu5 = "\t\t5. Kambing Guling Spesial";
        double harga1 = 9999.99, harga2 = 12345.67,
                harga3 = 21108.40, harga4 = 13579.13,
                harga5 = 13579.13;
        System.out.printf("\n%-40s %-5s %8s",menu1,simbol,df.format(harga1));
        System.out.printf("\n%-40s %-5s %8s",menu2,simbol,df.format(harga2));
        System.out.printf("\n%-40s %-5s %8s",menu3,simbol,df.format(harga3));
        System.out.printf("\n%-40s %-5s %8s",menu4,simbol,df.format(harga4));
        System.out.printf("\n%-40s %-5s %8s",menu5,simbol,df.format(harga5));

        System.out.println("");
        System.out.println("\nPesanan Anda [batas pesanan 0-10 per menu]");
        System.out.printf("%-30s %-3s","1. Nasi Goreng Spesial","=");
        int banyak1 = input.nextInt();
        System.out.printf("%-30s %-3s","2. Ayam Bakar Spesial","=");
        int banyak2 = input.nextInt();
        System.out.printf("%-30s %-3s","3. Steak Sirloin Spesial","=");
        int banyak3 = input.nextInt();
        System.out.printf("%-30s %-3s","4. Kwetiaw Siram Spesial","=");
        int banyak4 = input.nextInt();
        System.out.printf("%-30s %-3s","5. Kambing Guling Spesial","=");
        int banyak5 = input.nextInt();

        double a = banyak1*harga1, b = banyak2*harga2, c = banyak3*harga3,
                d = banyak4*harga4, e = banyak5*harga5;
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\tSelamat Menikmati Makanan Anda....");
        Scanner lanjut = new Scanner(System.in);
        System.out.println("\t\t\t\t\t...tekan ENTER untuk lanjut ke total pembelian...");
        lanjut.nextLine();
        System.out.println("");
        System.out.println("Pembelian  :");
        System.out.printf("\n%-30s %-2s %-6s %-2s %-5s %9s %-3s %-9s %20s %3s","1. Nasi Goreng Spesial",banyak1,"porsi","*","Rp.", df.format(harga1),"=","Rp.", df.format(a),"");
        System.out.printf("\n%-30s %-2s %-6s %-2s %-5s %9s %-3s %-9s %20s %3s","2. Ayam Bakar Spesial",banyak2,"porsi","*","Rp.", df.format(harga2),"=","Rp.", df.format(b),"");
        System.out.printf("\n%-30s %-2s %-6s %-2s %-5s %9s %-3s %-9s %20s %3s","3. Steak Sirloin Spesial",banyak3,"porsi","*","Rp.", df.format(harga3),"=","Rp.", df.format(c),"");
        System.out.printf("\n%-30s %-2s %-6s %-2s %-5s %9s %-3s %-9s %20s %3s","4. Kwetiaw Siram Spesial",banyak4,"porsi","*","Rp.", df.format(harga4),"=","Rp.", df.format(d),"");
        System.out.printf("\n%-30s %-2s %-6s %-2s %-5s %9s %-3s %-9s %20s %3s","5. Kambing Guling Spesial",banyak5,"porsi","*","Rp.", df.format(harga5),"=","Rp.", df.format(e),"+");
        System.out.println("");
        for(int i=0;i<100;i++){
            System.out.print("=");
        };
        double total = a+b+c+d+e;
        double disc = 0.1 * total;
        double afdisc = total - disc;
        double finalPrice = afdisc/jumlah;
        System.out.printf("\n%-59s %-3s %-20s %8s %3s", "Total Pembelian","=","Rp.",df.format(total),"");
        System.out.printf("\n%-59s %-3s %-21s %8s %3s", "Disc. 10% <Masa Promosi>","=","Rp.",df.format(disc),"-");
        System.out.println("");
        for(int i=0;i<100;i++){
            System.out.print("=");
        };
        System.out.printf("\n%-59s %-3s %-20s %8s %3s", "Total Pembelian Setelah disc 10 %","=","Rp.",df.format(afdisc),"");
        System.out.printf("\n%-26s %-5s %25s %5s %26s %3s", String.format("Pembelian per Orang <untuk %d",jumlah), "orang>","=","Rp.",df.format(finalPrice),"");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\tTerima kasih atas kunjungan Anda...");
        Scanner enter = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t...tekan ENTER untuk keluar...");
        enter.nextLine();
    }
}