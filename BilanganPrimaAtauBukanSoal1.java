package soal;

import java.util.Scanner;
public class BilanganPrimaAtauBukanSoal1{
// "Fungsi untuk memeriksa apakah bilangan adalah bilangan prima"
public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;  // "Bilangan kurang dari atau sama dengan 1 bukan bilangan prima"
    }

    // "Memeriksa faktor pembagi dari 2 hingga akar kuadrat dari bilangan"
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;  // "Jika ada pembagi selain 1 dan number, maka bukan prima"
        }
    }
    return true;  // "Jika tidak ditemukan pembagi, maka bilangan prima"
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // "Meminta pengguna untuk memasukkan bilangan"
    System.out.print("Masukkan sebuah bilangan: ");
    int number = scanner.nextInt();

    // "Memeriksa dan menampilkan apakah bilangan tersebut prima atau bukan"
    if (isPrime(number)) {
        System.out.println(number + " adalah bilangan prima.");
    } else {
        System.out.println(number + " bukan bilangan prima.");
    }

    // "Menutup scanner"
    scanner.close();
}
}