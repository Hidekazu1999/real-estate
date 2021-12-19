package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class PaymentProcessor implements PaymentProcessorHandler {
	private PaymentProcessorHandler proximoPayment;

	@Override
	public void setPayment(PaymentProcessorHandler payment) {
		this.proximoPayment = payment;

	}

	public void processPayment(Property property) {
		if (proximoPayment != null) {
			proximoPayment.process(property);
		}

	}

}
