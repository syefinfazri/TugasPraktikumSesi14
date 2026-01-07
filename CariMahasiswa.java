public class CariMahasiswa {
    public static void main(String[] args) {
        String[] nim = {"22001", "22002", "22003"};
        String[] nama = {"Andi", "Budi", "Citra"};

        String cariNama = "Budi";
        boolean ditemukan = false;
        int indeks = -1;
        int langkah = 0;

        for (int i = 0; i < nama.length; i++) {
            langkah++;
            if (nama[i].equalsIgnoreCase(cariNama)) {
                ditemukan = true;
                indeks = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Mahasiswa ditemukan");
            System.out.println("Nama: " + nama[indeks]);
            System.out.println("NIM : " + nim[indeks]);
            System.out.println("Indeks ke-" + indeks);
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }

        System.out.println("Jumlah perbandingan: " + langkah);
    }
}
