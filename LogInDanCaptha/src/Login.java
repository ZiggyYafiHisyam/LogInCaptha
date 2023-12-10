import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // Deklarasi variabel
        String username, password, captha;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan username: ");
        username = scanner.nextLine();
        System.out.println("Masukkan password: ");
        password = scanner.nextLine();
        System.out.println("Masukkan captha: ");
        captha = scanner.nextLine();

        // Membaca data dari database
        String databaseUsername = "Ziggy";
        String databasePassword = "161104";
        String databaseCaptha = "VZ07RKP";

        // Melakukan pengecekan
        if (username.equals(databaseUsername) && password.equals(databasePassword) && captha.equals(databaseCaptha)) {
            System.out.println("Login berhasil");
        } else if (username.equals(databaseUsername) && password.equals(databasePassword) && !captha.equals(databaseCaptha)) {
            System.out.println("Captha salah");
        } else if (!username.equals(databaseUsername)) {
            System.out.println("Username salah");
        } else {
            System.out.println("Password salah");
        }
    }
}
