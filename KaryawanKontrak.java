public class KaryawanKontrak extends Karyawan {
    private int upah_harian;
    private int jumlah_hari;

    public KaryawanKontrak(String nama, String alamat, int jumlah_anak, int upah_harian, int jumlah_hari)
    {
        super(nama, alamat, jumlah_anak);
        this.upah_harian = upah_harian;
        this.jumlah_hari = jumlah_hari;
    }

    public int hitungTotalUpah()
    {
        return upah_harian * jumlah_hari + hitungTunjanganAnak();
    }
}