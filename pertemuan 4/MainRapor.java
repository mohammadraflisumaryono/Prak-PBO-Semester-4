public class MainRapor {

    public static void main(String[] args) {
        Siswa Siswa = new Siswa();
        Rapor rapor1 = Siswa.getRapor(10, 1);
        Rapor rapor2 = Siswa.getRapor(11, 2);
        boolean kenaikan1 = Siswa.kenaikanKelas(rapor1, 10);
        boolean kenaikan2 = Siswa.kenaikanKelas(rapor2, 11);
        System.out.println("Kenaikan kelas rapor 1 : " + kenaikan1);
        System.out.println("Kenaikan kelas rapor 2 : " + kenaikan2);
    }

}
