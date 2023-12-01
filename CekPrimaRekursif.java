import java.util.Scanner;
public class CekPrimaRekursif {

    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        System.out.println("Masukkan bilangan yang ingin dicek: ");
        // Ganti dengan bilangan yang ingin Anda cek
        int n = input27.nextInt(); 

        if (cekPrimaRekursif(n, 2)) 
        {
            System.out.println(n + " adalah bilangan prima.");
        } 
        else 
        {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    // Fungsi rekursif untuk mengecek apakah suatu bilangan prima atau bukan
    static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 2) 
        {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) 
        {
            return false;
        }
        if (i * i > n) 
        {
            return true;
        }
        return cekPrimaRekursif(n, i + 1);
    }
}