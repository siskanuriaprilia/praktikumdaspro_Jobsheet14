import java.util.Scanner;

public class Rekursif_Percobaan227 {

    static int hitungPangkat(int x, int y) 
    {
        if (y == 0) 
        {
            System.out.print("1 ");
            return 1;
        } 
        else 
        {
            int hasil = x * hitungPangkat(x, y - 1);
            System.out.print("x " + x + " ");
            return hasil;
        }
    }

    public static void main(String[] args) 
    {
        Scanner input27 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.println("Bilangan yang dihitung: ");
        bilangan = input27.nextInt();
        System.out.println("Pangkat: ");
        pangkat = input27.nextInt();

        int hasilPangkat = hitungPangkat(bilangan, pangkat);
        System.out.println("= " + hasilPangkat);
    }
}