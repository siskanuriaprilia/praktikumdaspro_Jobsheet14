import java.util.Scanner;

public class RekursifPenjumlahan27 {

    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan nilai n: ");
    int nilaiN = scanner.nextInt();

    int hasilPenjumlahan = hitungPenjumlahan(nilaiN);
    System.out.println("Penjumlahan 1+2+3+4+5+6+7...+" + nilaiN + " adalah: " + hasilPenjumlahan);
    }
}