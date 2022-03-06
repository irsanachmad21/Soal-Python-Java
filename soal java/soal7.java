import java.util.*;
public class soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        int x,y;
        float p,q;

        //input data
        System.out.print("masukan nilai X = ");
        x = input.nextInt();
        System.out.print("masukan nilai Y = ");
        y = input.nextInt();

        //proses
        p = x + y;
        if (p > 0) {
            q = x*y;
            System.out.println("nilai P = " + p + " nilai Q = " + q);
        } else if (p < 0){
            q = x/y;
            System.out.println("nilai P = " + p + " nilai Q = " + q);
        } else {
            System.out.println("Q tidak terdefinisi");
        }
        

        input.close();
    }
}
