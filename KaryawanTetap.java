public class KaryawanTetap extends Karyawan {
    private int gaji_pokok;

    public KaryawanTetap(String nama, String alamat, int jumlah_anak, int gaji_pokok)
    {
        super(nama, alamat, jumlah_anak);
        this.gaji_pokok = gaji_pokok;
    }

    public int hitungTotalGaji()
    {
        return gaji_pokok + hitungTunjanganAnak();
    }
}