package personel.prac.designpattern.state.context;

import personel.prac.designpattern.state.OrderState;
import personel.prac.designpattern.state.concretestate.Cancelled;
import personel.prac.designpattern.state.concretestate.Delivered;
import personel.prac.designpattern.state.concretestate.InTransit;
import personel.prac.designpattern.state.concretestate.New;
import personel.prac.designpattern.state.concretestate.Paid;

public class Order {
	private OrderState currentState;

	public Order() {
		currentState = new New();
	}

	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}

	public void paymentSuccessful() {
		currentState = new Paid();
	}

	public void dispatched() {
		currentState = new InTransit();
	}

	public void delivered() {
		currentState = new Delivered();
	}
}
