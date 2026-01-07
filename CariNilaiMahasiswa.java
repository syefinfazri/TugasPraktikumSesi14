public class CariNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {70, 80, 85, 90, 75};
        int cari = 85;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        System.out.println("Nilai yang dicari: " + cari);
        System.out.println("Status pencarian: " + 
            (ditemukan ? "Ditemukan" : "Tidak ditemukan"));
    }
}
