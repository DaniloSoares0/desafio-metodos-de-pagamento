package br.com.codenation.paymentmethods;

public enum PaymentMethod {

	CASH(new Cash()),
    CREDIT_CARD(new CreditCard()),
    DEBIT_CARD(new DebitCard()),
    TRANSFER(new Transfer());

    private PriceStrategy priceStrategy;

    PaymentMethod(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public PriceStrategy getPaymentStrategy() {
        return priceStrategy;
    }
}