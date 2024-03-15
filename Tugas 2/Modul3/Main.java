public class Main {
    public static void main(String[] args) {
        Hewan elang = new Hewan("Elang");
        elang.beratHewan(5);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();
        Hewan kucing = new Hewan("Kucing", 5, 4);
        kucing.cetakHewan();
    }

}
