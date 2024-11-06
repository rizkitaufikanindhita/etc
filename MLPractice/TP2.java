package com.rizkitaufik;

import java.util.*;

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status1 = true;
        boolean status2 = true;
        boolean kondisi =true;
        int num1 = 0;
        int num2 = 0;
        System.out.println("\tBelajar Deret Aritmatika, Geometri dan menghitung Faktorial");
        while (kondisi){
            while(status1){
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
                num1 = input.nextInt();
                if (num1 < 2 || num1 > 10){
                    System.out.println("Masukkan banyak angka antara 2 dan 10");
                } else {
                    status1 = false;
                }
            }
            while(status2){
                System.out.print("Masukkan beda masing-masing angka [2..9] : ");
                num2 = input.nextInt();
                if (num2 < 2 || num2 > 9){
                    System.out.println("Masukkan beda masing-masing angka antara 2 dan 9");
                } else {
                    status2 = false;
                }
            }
            System.out.println("Deret Aritmatika : ");
            Aritmatika(num1,num2);
            System.out.println();
            System.out.println("Deret Geometri : ");
            Geometry(num1,num2);
            System.out.println();
            System.out.println("Faktorial dari "+num1+" :");
            Faktorial(num1);

            // Anda mau mengulang
            System.out.println();
            System.out.println("Anda mau ulang [Y/N]");
            Scanner ulang = new Scanner(System.in);
            String yesNo = ulang.nextLine();
            if (yesNo.equalsIgnoreCase("Y")){
                kondisi = true;
                status1 = true;
                status2 = true;
            } else {
                kondisi = false;
                status1 = false;
                status2 = false;
            }
        }
    }

    // Method Deret Aritmatika
    private static void Aritmatika(int num1, int num2){
        int[] deretAritmatika = new int[num1];
        for (int i = 1; i<=num1; i++){
            if (i==1){
                deretAritmatika[i-1] = 1;
            } else {
                deretAritmatika[i-1] = deretAritmatika[i-2] + num2;
            }
        }
        System.out.println(Arrays.toString(deretAritmatika));
    }
    // Method Deret Geometri
    private static void Geometry(int num1, int num2){
        int[] deretGeometry = new int[num1];
        for (int i = 1; i<=num1; i++){
            if (i==1){
                deretGeometry[i-1] = 1;
            } else {
                deretGeometry[i-1] = deretGeometry[i-2] * num2;
            }
        }
        System.out.println(Arrays.toString(deretGeometry));
    }
    // Method Faktorial
    private static void Faktorial(int num1){
        for (int i = num1; i >= 1; i--){
            if (i == num1){
                System.out.print(i);
            } else {
                System.out.print(" * "+i);
            }
        }
        System.out.print(" = ");
        int[] lst = new int[num1];
        for (int i = 1; i <= num1;i++){
            lst[i-1] = i;
        }
        int sum = 1;
        for (int i = 1; i <= num1;i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
