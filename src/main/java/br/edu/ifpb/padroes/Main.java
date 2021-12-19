package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.CompoundPayment;
import br.edu.ifpb.padroes.payment.PaymentService;

public class Main {
    public static void main(String[] args) {

    	PaymentService paymentService = new PaymentService();
    	
        Apartment apartment = new Apartment();
        apartment.setAddress("Rua x");
        apartment.setBuilder("Apartamento construtura");
        apartment.setPrice(200000);

        Bungalow bungalow = new Bungalow();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("Bangalô construtura");
        bungalow.setPrice(150000);

        Tenement tenament = new Tenement();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("Cortiço construtura");
        bungalow.setPrice(100000);
        
        CompoundPayment compoundPayments = new CompoundPayment(apartment, bungalow, tenament);

        // TODO - reduzir chamadas múltiplas para uma única chamada para o método pay() utilizando o padrão composite
          paymentService.pay(compoundPayments);
//        paymentService.pay(bungalow);
//        paymentService.pay(tenament);


    }
}