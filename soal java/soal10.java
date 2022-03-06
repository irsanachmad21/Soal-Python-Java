import java.util.*;
public class soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi 
        int gol,jamkerja;
        double gaji;

        //input
        System.out.print("Golongan (1/2/3/4) : ");
        gol = input.nextInt();
        System.out.print("Jam kerja perminggu : ");
        jamkerja = input.nextInt();

        //proses
        if (gol == 1) {
            if (jamkerja <= 40) {
                gaji = jamkerja*3000;
            } else {
                gaji = (40*3000) + (jamkerja-40) *1.5*3000;
            }
        } else if (gol == 2) {
            if (jamkerja <= 40) {
                gaji = jamkerja*3500;
            } else {
                gaji = (40*3500) + (jamkerja-40) *1.5*3500;
            }
        } else if (gol == 3) {
            if (jamkerja <= 40) {
                gaji = jamkerja*4000;
            } else {
                gaji = (40*4000) + (jamkerja-40) *1.5*4000;
            }
        } else {
            if (jamkerja <= 40) {
                gaji = jamkerja*5000;
            } else {
                gaji = (40*5000) + (jamkerja-40) *1.5*5000;
            }
        }
        System.out.println("Gaji anda perminggu = Rp " + gaji);

        input.close();
    }
}
