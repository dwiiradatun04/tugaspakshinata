import java.util.Scanner;

public class waktutempuh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //  masukkan jarak
        System.out.print("Masukkan jarak tempuh (km) :");
        int jarak = input.nextInt();

        //masukkan kecepatan
        System.out.print("Masukkan kecepatan kendaraan (km/jam) :");
        int kecepatan = input.nextInt();

        //masukkan bahan bakar l/km
        System.out.print("Masukkan bahan bakar yang dikonsumsi (liter/km) :");
        int bahanbakar = input.nextInt();

        //masukkan harga bensin per liter
        System.out.print("Masukkan harga bensin per liter :");
        int hargabensin = input.nextInt();

        //menghitung waktu tempuh
        int waktutempuh = jarak / kecepatan;

        //menghitung konsumsi bensin
        int konsumsibensin = jarak / bahanbakar;

        //menghitung total bensin yang dikonsumsi
        int totalharga = bahanbakar * hargabensin;

        // hasil perhitungan 
        System.out.println("Waktu tempuh : " + waktutempuh + " jam");
        System.out.println("Konsumsi bensin : " + konsumsibensin + " liter");
        System.out.println("Harga total bensin : Rp " + totalharga);
    }
}
