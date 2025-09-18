// Manager.java
package id.ac.polban.model;

// 'extends Karyawan' berarti Manager adalah subclass dari Karyawan
public class Manager extends Karyawan {
    private double tunjangan;

    // Konstruktor untuk Manager
    public Manager(String nama, String jabatan, double gaji, double tunjangan) {
        // 'super()' memanggil konstruktor dari superclass (Karyawan)
        super(nama, jabatan, gaji); 
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    // Penerapan Override
    @Override
    public String toString() {
        // Memanggil toString() milik Karyawan menggunakan 'super'
        // lalu menambahkan informasi baru.
        return super.toString() + "\n" +
               "Tunjangan: " + tunjangan;
    }
}