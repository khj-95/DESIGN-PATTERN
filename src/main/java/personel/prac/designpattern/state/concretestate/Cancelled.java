package personel.prac.designpattern.state.concretestate;

import personel.prac.designpattern.state.OrderState;

public class Cancelled implements OrderState {
	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Cancelled order. Can't cancel anymore");
	}

	@Override
	public OrderState next() {
		return null;
	}
}
