package br.com.codenation.paymentmethods;

import br.com.codenation.Order;

public interface PriceStrategy {

    Double calculate(Double price);

}
