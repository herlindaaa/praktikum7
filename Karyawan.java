public class Karyawan
{
    private String nama;
    private String alamat;
    private int jumlah_anak;

    public Karyawan(String nama, String alamat, int jumlah_anak)
    {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlah_anak = jumlah_anak;
    }
    
    public int hitungTunjanganAnak()
    {
        return jumlah_anak * 100000;
    }
}