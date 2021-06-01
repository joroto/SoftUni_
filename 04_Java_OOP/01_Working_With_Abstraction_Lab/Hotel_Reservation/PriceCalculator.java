package Hotel_Reservation;

public class PriceCalculator {
    private double price;
    private double pricePerDay;

    public PriceCalculator(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void CalculatePrice( int numberOfDays, String season, String discountType){

        CalculateSeasonalPrice(season);

        price = pricePerDay * numberOfDays;

        ApplyDiscount(discountType);

        PrintPrice(price, 2);
    }

    private void PrintPrice(double price, int afterDecimal) {
        System.out.printf("%." + afterDecimal + "f", price);
    }

    private void ApplyDiscount(String discountType) {
        switch (discountType){
            case "VIP":
                price -= 0.2 * price;
                break;
            case "SecondVisit":
                price -= 0.1 * price;
                break;
        }
    }

    private void CalculateSeasonalPrice(String season) {
        switch (season){
            case "Spring":
                pricePerDay *= 2;
                break;
            case "Winter":
                pricePerDay *= 3;
                break;
            case "Summer":
                pricePerDay *= 4;
                break;
        }
    }
}
