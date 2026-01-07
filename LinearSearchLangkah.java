public class LinearSearchLangkah {
    public static void main(String[] args) {
        int[] data = {10, 25, 30, 45, 50};
        int cari = 30;
        int langkah = 0;
        boolean ditemukan = false;

        for (int i = 0; i < data.length; i++) {
            langkah++;
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        System.out.println("Jumlah data dalam array: " + data.length);
        System.out.println("Jumlah langkah pencarian: " + langkah);
        System.out.println("Status: " + (ditemukan ? "Ditemukan" : "Tidak ditemukan"));
    }
}
