package lesson2;

public class CurrencyConverter {
    private int commission;
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate){
        this.exchangeRate = exchangeRate;
        this.commission = 1;
    }

    private double convertUsdToUah() {
        return exchangeRate;
    }

    private double calculateCommission() {
        return (double) commission / 100;
    }


    public double calculateTotalAmount(int usd){
        return ((usd - (usd * calculateCommission())) * convertUsdToUah());
    }

}


