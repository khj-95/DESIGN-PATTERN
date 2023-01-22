package personel.prac.designpattern.state.concretestate;

import personel.prac.designpattern.state.OrderState;

public class New implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("It's a new order. No precessing done");
		return 0;
	}

	@Override
	public OrderState next() {
		return null;
	}
}
