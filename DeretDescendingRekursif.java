import java.util.Scanner;
public class DeretDescendingRekursif{

    //Fungsi rekursif
    static void deretDescRekursif(int n) 
    {
        if (n >= 0) 
        {
            System.out.print(n + " ");
            deretDescRekursif(n - 1);
        }
    }

    //Fungsi iteratif
    static void deretDescIteratif(int n) 
    {
        for (int i = n; i >= 0; i--) 
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Deret Descending Rekursif:");
        deretDescRekursif(n);

        System.out.println("\n\nDeret Descending Iteratif:");
        deretDescIteratif(n);
    }
}