public class Truk extends Kendaraan implements DapatDisewa, Muatan {

    private double muatanKg;

    public Truk(String platNomor, String merk, int tahunProduksi, double muatanKg) {
        super(platNomor, merk, tahunProduksi);
        this.muatanKg = muatanKg;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 1_500_000;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return muatanKg;
    }
}
