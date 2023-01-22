package personel.prac.designpattern.state;

import personel.prac.designpattern.state.context.Order;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.cancel();
		order.paymentSuccessful();
		order.dispatched();
		order.delivered();
		order.cancel();
		order.cancel();
	}
}
