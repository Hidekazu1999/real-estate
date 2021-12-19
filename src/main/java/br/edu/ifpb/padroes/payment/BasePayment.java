package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class BasePayment implements Property {
	public float price;
	
	public BasePayment(float price){
		this.price = price;
		
	}
	
	/**
	 *
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}