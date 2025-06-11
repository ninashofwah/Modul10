public class Main {
    public static void main(String[] args) {
        MobilPribadi mobil = new MobilPribadi("B123XYZ", "Toyota", 2022);
        Bus bus = new Bus("B456JKT", "Mercedes", 2019);
        Truk truk = new Truk("B789ABC", "Suzuki", 2015, 5000);

        System.out.println("=== Mobil Pribadi ===");
        mobil.tampilkanInfo();
        System.out.println("Biaya sewa 7 hari: " + mobil.hitungBiayaSewa(7));
        System.out.println("Perlu supir? " + mobil.perluSupir());

        System.out.println("\n=== Bus ===");
        bus.tampilkanInfo();
        System.out.println("Biaya sewa 3 hari: " + bus.hitungBiayaSewa(3));
        System.out.println("Perlu supir? " + bus.perluSupir());

        System.out.println("\n=== Truk ===");
        truk.tampilkanInfo();
        System.out.println("Biaya sewa 1 hari: " + truk.hitungBiayaSewa(1));
        System.out.println("Perlu supir? " + truk.perluSupir());
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}

