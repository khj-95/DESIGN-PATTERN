package personel.prac.designpattern.state.concretestate;

import personel.prac.designpattern.state.OrderState;

public class InTransit implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("Connecting courier service for cancellation");
		System.out.println("Connecting payment gateway for transaction roll back");
		return 20;
	}

	@Override
	public OrderState next() {
		return null;
	}
}
