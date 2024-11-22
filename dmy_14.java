import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dmy_14 {
    public static void main(String[] args) {
        Date tanggalSekarang = new Date();

        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        SimpleDateFormat formatTahun = new SimpleDateFormat("yyyy", Locale.getDefault());

        String tanggalFormat = formatTanggal.format(tanggalSekarang);
        String tahunSekarang = formatTahun.format(tanggalSekarang);

        System.out.println(tanggalFormat);

        System.out.println("" + tahunSekarang );
}
}
