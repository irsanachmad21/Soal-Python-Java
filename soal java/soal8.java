import java.util.*;
public class soal8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int jam1, menit1,detik1,
        jam2,menit2,detik2,jammasuk,
        jamkeluar,totaljam,biayaparkir;

        //input data
        //jam pertama
        System.out.print("masukan jam pertama = ");
        jam1 = input.nextInt();
        System.out.print("masukan menit pertama = ");
        menit1 = input.nextInt();
        System.out.print("masukan detik pertama = ");
        detik1 = input.nextInt();

        //jam kedua
        System.out.print("masukan jam kedua = ");
        jam2 = input.nextInt();
        System.out.print("masukan menit kedua = ");
        menit2 = input.nextInt();
        System.out.print("masukan detik kedua = ");
        detik2 = input.nextInt();


        //proses
        jammasuk = jam1 + (menit1/60) + (detik1/3600);
        jamkeluar = jam2 + (menit2/60) + (detik2/3600);
        totaljam = jamkeluar - jammasuk;

        //percabangan
        if (totaljam <= 2) {
            biayaparkir = 2000;
        } else {
            biayaparkir = 2000 + (totaljam-2)*500;
        }
        System.out.println("biaya parkir anda = " + biayaparkir);
















        input.close();
    }
}