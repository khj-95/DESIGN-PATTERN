package personel.prac.designpattern.state.concretestate;

import personel.prac.designpattern.state.OrderState;

public class Paid implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("Connecting payment gateway to rollback transaction");
		return 10;
	}

	@Override
	public OrderState next() {
		return null;
	}
}
