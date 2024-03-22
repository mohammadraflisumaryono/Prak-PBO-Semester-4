import java.text.DecimalFormat;

public class DemoEnkapsulasi {
    public static void main(String[] args) {
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        System.out.println("\nDEMO ENKAPSULASI\n");
        System.out.println("======================");
        HitungGaji Tony = new HitungGaji();
        Tony.setGaji(25000000);
        Tony.HitungGaji();

        System.out.println("\nInformasi Gaji Pegawai");
        System.out.println("Besar Gaji Kotor : Rp. " + digitPresisi.format(Tony.getGajiKotor()));
        System.out.println("Besar Gaji yang dibawa pulang : Rp. " + digitPresisi.format(Tony.getGajiBersih()));
    }
}