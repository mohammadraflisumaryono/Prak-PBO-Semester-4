
public class Siswa {
    boolean kenaikanKelas(Rapor rapor, int kelas) {
        if (rapor.getKelas() == kelas) {
            return true;
        } else {
            return false;
        }
    }

    Rapor getRapor(int kelas, int sem) {
        return new Rapor(kelas, sem);
    }

    void isiRapor() {
        Rapor rapor = new Rapor(10, 1);
    }
}