public class Dosen {
    private String nip;
    private String nama;

    public Dosen(String nim, String nama) {
        this.nip = nim;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nip;
    }
}