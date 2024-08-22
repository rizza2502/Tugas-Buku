
import java.util.Scanner;

public class MainTester{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nama;
        int id;
        double ipk;

        System.out.println("nama: ");
        nama = in.nextLine();

        System.out.println("id: ");
        id = in.nextInt();

        System.out.println("ipk: ");
        ipk = in.nextDouble();

        Main m1 = new Main(id, nama, ipk);

        m1.uraikan();

    }
}