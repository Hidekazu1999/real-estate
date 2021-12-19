package br.edu.ifpb.padroes.payment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.edu.ifpb.padroes.domain.Property;

public class CompoundPayment extends BasePayment{
	
    protected List<Property> children = new ArrayList<>();

    public CompoundPayment(Property... components) {
    	super(0);
        add(components);
    }
    
    public void add(Property components) {
        children.add(components);
    }

    public void add(Property... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Property child) {
        children.remove(child);
    }

    public void remove(Property... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }
    
    @Override
    public float getPrice() {
        float price = 0;
        for(Property child: children){
            price += child.getPrice();
        }
        this.setPrice(price);
        return this.price;
    }
    

}
