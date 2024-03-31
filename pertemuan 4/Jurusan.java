public class Jurusan {
    private String namaJurusan;
    private Dosen dosen;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }
}