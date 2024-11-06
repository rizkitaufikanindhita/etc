package Session5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class pengulangan {
    public static void main(String[] args) {

        // Input User dan NIM
        Scanner input = new Scanner(System.in);
        boolean isUser = true;
        boolean isInduk = true;
        String user ="",nim = "";
        while (isUser){
            System.out.print("masukkan nama anda : ".toUpperCase());
            user = input.next();
            if (user.length()==0 || user.length()>25 ){
                System.out.println("karakter minimal 1 dan maksimal 25".toUpperCase());
            } else {
                isUser = false;
            }
        }
        while (isInduk){
            System.out.print("masukkan nim anda : ".toUpperCase());
            nim = input.next();
            if (nim.length()==10){
                isInduk = false;
            } else{
                System.out.println("nim harus 10 karakter".toUpperCase());
            }
        }

        System.out.println();
        System.out.println("@".repeat(40));
        System.out.println();

        // resigtrasi sukses
        if (isUser && isInduk){
            System.out.println("Registrasi sukses...".toUpperCase());
        }

        // greeting
        String nomor = String.format(" [NIM : %s]",nim);
        System.out.println("selamat datang ".toUpperCase() + user.toUpperCase() + nomor + "..^^v");
        System.out.println();
        System.out.println("mari belajar macam-macam deret bilangan".toUpperCase());

        // input angka
        System.out.println();
        System.out.println("@".repeat(40));
        System.out.println();
        Integer angka = 0;
        boolean isNum = true;
        boolean isUlang = true;
        while(isUlang){
            while(isNum){
                System.out.print("masukkan sembarang angka : ".toUpperCase());
                angka = input.nextInt();
                if (angka < 5 || angka > 20){
                    System.out.println("angka minimal 5 dan maksimal 20");
                } else {
                    isNum = false;
                }
            }
            System.out.println("@".repeat(40));

            // deret bilangan
            System.out.println("deret bilangan".toUpperCase());
            System.out.println("#".repeat(20));

            // bilangan genap
            System.out.println(angka+" bilangan genap :".toUpperCase());
            int num = angka*2;
            IntStream numRange = IntStream.range(1,num+1);
            int[] numJarak = numRange.toArray();
            ArrayList<Integer> lst = new ArrayList<Integer>();
            for (int i : numJarak){
                if (i%2==0){
                    lst.add(i);
                }
            }
            int sum = 0;
            for (int a : lst){
                sum += a;
            }
            System.out.println(lst);
            System.out.println("Hasil Penjumlahan : "+ sum);

            // bilangan ganjil
            System.out.println();
            System.out.println(angka+" bilangan ganjil :".toUpperCase());
            ArrayList<Integer> lstA = new ArrayList<Integer>();
            for (int i : numJarak){
                if (i%2!=0){
                    lstA.add(i);
                }
            }
            int sumA = 0;
            for (int a : lstA){
                sumA += a;
            }
            System.out.println(lstA);
            System.out.println("Hasil Penjumlahan : "+ sumA);

            // fibonacci
            System.out.println();
            System.out.println(angka+" bilangan fibonacci :".toUpperCase());
            ArrayList<Integer> fibonacciLst = new ArrayList<Integer>();
            for (int i = 1;i<angka+1;i++){
                fibonacciLst.add(fibonacci(i));
            }
            int jumlah = 0;
            for (int m : fibonacciLst){
                jumlah += m;
            }
            System.out.println(fibonacciLst);
            System.out.println("Hasil Penjumlahan : "+ jumlah);

            // mengulang
            System.out.println();
            System.out.print("Anda ingin mengulang (Y/N) : ");
            Scanner inputA = new Scanner(System.in);
            String yesNo = inputA.nextLine();
            if (yesNo.equalsIgnoreCase("N")){
                isUlang = false;
                isNum = false;
            } else{
                isUlang = true;
                isNum = true;
            }
        }
    }
    // recursion
    private static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
