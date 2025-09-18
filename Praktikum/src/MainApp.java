import id.ac.polban.model.Karyawan;
import id.ac.polban.model.Kantor;
import id.ac.polban.model.Manager;
import id.ac.polban.service.KaryawanService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kantor kantor = new Kantor("JTK Corps");
        KaryawanService service = new KaryawanService();

        int pilihan;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Daftar Karyawan");
            System.out.println("3. Hapus Karyawan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Pilih jenis karyawan: ");
                    System.out.println("1. Karyawan Biasa");
                    System.out.println("2. Manager");
                    System.out.print("Pilihan: ");
                    int jenisKaryawan = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer

                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jabatan: ");
                    String jabatan = scanner.nextLine();
                    System.out.print("Masukkan gaji: ");
                    double gaji = scanner.nextDouble();
                    scanner.nextLine();

                    if (jenisKaryawan == 1) {
                        Karyawan karyawan = new Karyawan(nama, jabatan, gaji);
                        kantor.tambahKaryawan(karyawan);
                    } else if (jenisKaryawan == 2) {
                        System.out.print("Masukkan tunjangan: ");
                        double tunjangan = scanner.nextDouble();
                        scanner.nextLine();
                        
                        // Membuat objek Manager dan menyimpannya sebagai tipe Karyawan (Polimorfisme)
                        Karyawan manager = new Manager(nama, jabatan, gaji, tunjangan);
                        kantor.tambahKaryawan(manager);
                    }
                    System.out.println("Karyawan berhasil ditambahkan!");
                }
                // ...existing code...
                case 2 -> {
                    System.out.println("\n=== Daftar Karyawan di " + kantor.getNamaKantor() + " ===");
                    if (kantor.getDaftarKaryawan().isEmpty()) {
                        System.out.println("Belum ada karyawan.");
                    } else {
                        for (int i = 0; i < kantor.getDaftarKaryawan().size(); i++) {
                            System.out.print((i + 1) + ". ");
                            service.cetakInformasi(kantor.getDaftarKaryawan().get(i));
                        }
                        System.out.println("Total Karyawan: " + Karyawan.getJumlahKaryawan());
                    }
                }
                // ...existing code...
                case 3 -> {
                    System.out.println("\n=== Hapus Karyawan ===");
                    if (kantor.getDaftarKaryawan().isEmpty()) {
                        System.out.println("Tidak ada karyawan untuk dihapus.");
                    } else {
                        for (int i = 0; i < kantor.getDaftarKaryawan().size(); i++) {
                            System.out.println((i + 1) + ". " + kantor.getDaftarKaryawan().get(i));
                        }
                        System.out.print("Pilih nomor karyawan yang ingin dihapus: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index > 0 && index <= kantor.getDaftarKaryawan().size()) {
                            Karyawan dihapus = kantor.getDaftarKaryawan().remove(index - 1);
                            System.out.println("Karyawan " + dihapus.getNama() + " berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }
                case 4 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
