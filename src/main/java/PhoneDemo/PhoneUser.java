package PhoneDemo;
import java.util.Scanner;

public class PhoneUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone selectedPhone = null;

        while (true) {

            System.out.println("DEMO PONSEL");
            System.out.println("=========================");
            System.out.println("1. Xiaomi ");
            System.out.println("2. iPhone ");
            System.out.println("3. Samsung ");
            System.out.println("4. Oppo ");
            System.out.println("0. Keluar ");
            System.out.println("Pilih Ponsel(1-0): ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                selectedPhone = new Xiaomi();
            } else if (choice.equals("2")) {
                selectedPhone = new iPhone();
            } else if (choice.equals("3")) {
                selectedPhone = new Samsung();
            } else if (choice.equals("4")) {
                selectedPhone = new Oppo();
            } else {
                System.out.println("Ponsel tidak ditemukan.");
                continue;
            }

            selectedPhone.powerOn();
            System.out.println(choice + " telah dihidupkan.");

            while (true) {
                System.out.println("DEMO PONSEL");
                System.out.println("=========================");
                System.out.println("1. Power On ");
                System.out.println("2. Power Off ");
                System.out.println("3. Volume Up ");
                System.out.println("4. Volume Down ");
                System.out.println("5. Volume ");
                System.out.println("0. Keluar ");
                System.out.println("Pilih Opsi(1-0): ");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("1")) {
                    selectedPhone.powerOff();
                    System.out.println(choice + " dihidupkan.");
                    break;
                } else if (action.equals("2")) {
                    selectedPhone.powerOff();
                    System.out.println(choice + " dimatikan.");
                } else if (action.equals("3")) {
                    selectedPhone.volumeUp();
                    System.out.println("Volume " + choice + " dinaikkan.");
                } else if (action.equals("4")) {
                    selectedPhone.volumeDown();
                    System.out.println("Volume " + choice + " diturunkan.");
                } else if (action.equals("5")) {
                    int volume = selectedPhone.getVolume();
                    System.out.println("Volume " + choice + ": " + volume);
                } else {
                    System.out.println("Perintah tidak valid.");
                }
            }
        }
        scanner.close();
    }
}
