public class HitungGaji {
    private double gajiKotor, gajiSetelahPajak;
    public double gajiBersih;
    private double potongan = 75000.00;

    public void setGaji(double gaji) {
        gajiKotor = gaji;
    }

    public void HitungGaji() {
        gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajiSetelahPajak - potongan;
    }

    public double getGajiKotor() {
        return gajiKotor;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

}
