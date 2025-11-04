public class Main {
    public static void main(String[] args) {
        RentalPS5 sewa1 = new RentalPS5("Rian", 3, 10000, false);
        sewa1.tampilkanInfo();

        RentalPS5 sewa2 = new RentalPS5("Aisy", 5, 10000, true);
        sewa2.tampilkanInfo();
    }
}