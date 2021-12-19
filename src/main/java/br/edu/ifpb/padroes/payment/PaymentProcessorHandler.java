package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {

	void process(Property property);
	void setPayment(PaymentProcessorHandler paymentProcessorHandler);

}
