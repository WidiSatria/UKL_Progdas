package soal;

import java.util.HashMap;
import java.util.Map;

public class ElemenPalingSeringMunculSoal3 {
    public static void main(String[] args) {
        // "Array yang akan diperiksa"
        int[] array = {3, 7, 3, 1, 7, 7, 5};

        // "Memanggil method untuk mencari elemen yang paling sering muncul"
        cariElemenPalingSering(array);
    }

    public static void cariElemenPalingSering(int[] array) {
        // "Menggunakan HashMap untuk menyimpan frekuensi kemunculan setiap elemen"
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        // "Menghitung frekuensi kemunculan setiap elemen dalam array"
        for (int num : array) {
            frekuensiMap.put(num, frekuensiMap.getOrDefault(num, 0) + 1);
        }

        // "Menyimpan elemen yang paling sering muncul dan frekuensinya"
        int elemenPalingSering = -1;
        int frekuensiTertinggi = 0;

        // "Iterasi HashMap untuk menemukan elemen dengan frekuensi tertinggi"
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            if (entry.getValue() > frekuensiTertinggi) {
                elemenPalingSering = entry.getKey();
                frekuensiTertinggi = entry.getValue();
            }
        }

        // "Menampilkan hasil"
        System.out.println("Elemen yang paling sering muncul adalah " + elemenPalingSering + " sebanyak " + frekuensiTertinggi + " kali");
    }
}