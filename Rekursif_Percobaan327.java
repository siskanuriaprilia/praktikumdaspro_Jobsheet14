import java.util.Scanner;

public class Rekursif_Percobaan327 {
    
    static double hitungLaba(double saldo, int tahun)
    {
        if(tahun == 0)
        {
            return (saldo);
        }
        else
        {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }


public static void main(String[] args) {
    Scanner input27 = new Scanner(System.in);
    double saldoAwal;
    int tahun;

    System.out.println("Jumlah saldo awal: ");
    saldoAwal = input27.nextInt();
    System.out.println("Lamanya investasi (tahun): ");
    tahun = input27.nextInt();

    System.out.println("Jumlah saldo setelah "+ tahun + " tahun : ");
    System.out.println(hitungLaba(saldoAwal, tahun));
  }
}

