import java.util.*;
public class soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        char jenis;
        int harga;
        double diskon;

        //proses
        System.out.print("masukan harga barang = ");
        harga = input.nextInt();

        System.out.print("masukan jenis barang (A/B/C) = ");
        jenis = input.next().charAt(0);

        //percabangan
        if (jenis == 'A') {
            diskon = (int) harga - (0.10*harga);
        } else if (jenis == 'B') {
            diskon = (int) harga - (0.15*harga);
        } else {
            diskon = (int) harga - (0.20*harga);
        }

        System.out.println("harga setelah diskon = Rp " + diskon);

        input.close();
    }
}
