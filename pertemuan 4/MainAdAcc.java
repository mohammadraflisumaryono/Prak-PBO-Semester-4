public class MainAdAcc {
    public static void main(String[] args) {
        // Membuat objek advertiser
        Advertiser advertiser1 = new Advertiser();
        Advertiser advertiser2 = new Advertiser();
        // Membuat objek akun
        Account account1 = new Account();
        Account account2 = new Account();
        // Menambahkan akun ke advertiser
        advertiser1.addAccount(account1);
        advertiser2.addAccount(account2);
        // Cek pemilik akun
        System.out.println("\nPemilik akun 1 : " + account1.getOwner());
        System.out.println("Pemilik akun 2 : " + account2.getOwner());
        // Mengubah pemilik akun
        account1.setOwner(advertiser2);
        // Cek pemilik akun setelah diubah
        System.out.println("\nPemilik akun 1 setelah diubah : " + account1.getOwner());
        System.out.println("Pemilik akun 2 setelah diubah : " + account2.getOwner());
        // Menghapus akun dari advertiser
        advertiser1.removeAccount(account1);
        // Cek pemilik akun setelah dihapus
        System.out.println("\nPemilik akun 1 setelah dihapus : " + account1.getOwner());
        System.out.println("Pemilik akun 2 setelah dihapus : " + account2.getOwner());
    }
}