package personel.prac.designpattern.state.concretestate;

import personel.prac.designpattern.state.OrderState;

public class Delivered implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("Connecting courier service for item pickup");
		System.out.println("Payment roll back will be initiated upon receiving returned item");
		return 30;
	}

	@Override
	public OrderState next() {
		return null;
	}
}
