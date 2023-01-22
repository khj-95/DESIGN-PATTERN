package personel.prac.designpattern.state;

public interface OrderState {
	double handleCancellation();
	OrderState next();
}
