public class User {
    String nama;
    int level;

    public void setUser(String setNama, int setLevel) {
        nama = setNama;
        level = setLevel;
    }

    public void getUser() {
        System.out.println("Nama  : " + nama);
        System.out.println("Level : " + level);
    }

    public static void main(String[] args) {
        User usr = new User();
        usr.setUser("John Doe", 5);
        usr.getUser();
    }
}
