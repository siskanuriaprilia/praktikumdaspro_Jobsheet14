public class JumlahPasanganMarmut {

    public static void main(String[] args) 
    {
        int bulanKe12 = 12;
        int jumlahPasangan = hitungPasanganMarmut(bulanKe12);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulanKe12 + " adalah: " + jumlahPasangan);
    }

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut pada bulan ke-n
    static int hitungPasanganMarmut(int bulan) 
    {
        if (bulan == 1 || bulan == 2) 
        {
            return 1;
        } 
        else 
        {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}