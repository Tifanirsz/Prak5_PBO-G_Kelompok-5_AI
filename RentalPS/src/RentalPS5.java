public class RentalPS5 extends RentalPS implements BonusMember {
    private boolean memberSetia;
    private double totalBiaya;

    public RentalPS5(String namaPenyewa, int lamaSewa, double hargaPerJam, boolean memberSetia){
        super(namaPenyewa, lamaSewa, hargaPerJam);
        this.memberSetia = memberSetia;
    }

    @Override
    public double hitungBiayaSewa(){
        totalBiaya = lamaSewa * hargaPerJam;
        if (memberSetia) totalBiaya -= totalBiaya * 0.1; // Diskon 10%
        return totalBiaya;
    }

    @Override
    public void beriBonus() {
        if (memberSetia)
            System.out.println("🎮 Bonus: Gratis 1 jam tambahan bermain!");
        else
            System.out.println("❌ Tidak ada bonus untuk non-member.");
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("===== DATA PENYEWA PS5 =====");
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Lama Sewa      : " + lamaSewa + " jam");
        System.out.println("Harga per Jam  : Rp " + hargaPerJam);
        System.out.println("Member Setia   : " + (memberSetia ? "Ya" : "Tidak"));
        System.out.println("Total Biaya    : Rp " + hitungBiayaSewa());
        beriBonus();
        System.out.println("=============================\n");
    }
}