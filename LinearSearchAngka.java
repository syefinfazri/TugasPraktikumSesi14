public class LinearSearchAngka {
    public static void main(String[] args) {
        int[] data = {10, 25, 30, 45, 50};
        int cari = 30;
        boolean ditemukan = false;
        int indeks = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                indeks = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
