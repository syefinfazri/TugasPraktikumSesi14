public class LinearSearchString {
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra", "Dewi"};
        String cari = "citra";
        int indeks = -1;

        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Nama ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Nama tidak ditemukan");
        }
    }
}
