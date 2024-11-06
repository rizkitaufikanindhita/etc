import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Program Simulasi");
        System.out.println("Menu : ");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();
        System.out.println("Random Data");
        System.out.print("Masukkan Batas Bawah : ");
        int numBawah = input.nextInt();
        System.out.print("Masukkan Batas Atas : ");
        int numAtas = input.nextInt();
        int count = 5;
        int[] array = new int[count];
        boolean lanjut = true;
        while(lanjut){
            if (pilihan == 1) {
                Random random = new Random();
                for (int i = 0; i < count; i++) {
                    int randomNumber = random.nextInt(numAtas - numBawah + 1) + numBawah;
                    array[i] = randomNumber;
                }
                for (int number : array) {
                    System.out.print(number + " ");
                }
                System.out.println();
                System.out.println("Masukkan Pilihan Simulasi/Keluar (2-6) : ");
                int choice = input.nextInt();
                if (choice == 2){
                    bubbleSortAsc(array);
                    lanjut = false;
                } else if (choice == 3) {
                    selectionSortAsc(array);
                    lanjut = false;
                } else if (choice == 4) {
                    bubbleSortDesc(array);
                    lanjut = false;
                } else if (choice == 5) {
                    selectionSortDesc(array);
                    lanjut = false;
                } else {
                    lanjut = false;
                }
            }
        }

    }
    // Selection Sort Ascending
    private static void selectionSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            System.out.println("Pass "+ (i+1));
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(Arrays.toString(array));
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            System.out.println(Arrays.toString(array));
            System.out.println("Result of Pass " + (i+1));
            System.out.println(Arrays.toString(array));
        }
    }

    // Selection Sort Descending
    private static void selectionSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            System.out.println("Pass "+ (i+1));
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(Arrays.toString(array));
                if(array[min] < array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            System.out.println(Arrays.toString(array));
            System.out.println("Result of Pass " + (i+1));
            System.out.println(Arrays.toString(array));
        }
    }

    // Bubble Sort Ascending
    private static void bubbleSortAsc(int[] array){
        for(int i = 0; i < array.length - 1; i++) {
            System.out.println("Pass "+ (i+1));
            for(int j = 0; j < array.length - i - 1; j++){
                System.out.println(Arrays.toString(array));
                if(array[j] > array[j+1]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Result of Pass " + (i+1));
            System.out.println(Arrays.toString(array));
        }
    }

    // Bubble Sort Descending
    private static void bubbleSortDesc(int[] array){
        for(int i = 0; i < array.length - 1; i++) {
            System.out.println("Pass "+ (i+1));
            for(int j = 0; j < array.length - i - 1; j++){
                System.out.println(Arrays.toString(array));
                if(array[j] < array[j+1]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Result of Pass " + (i+1));
            System.out.println(Arrays.toString(array));
        }
    }
}
