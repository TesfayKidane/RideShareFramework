package rideshare.framework.services.impl.payment.factory;

public class CashPaymentInfo extends APaymentInfo{
	public String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		super.toString();
		return "CashPaymentInfo [note=" + note + "]";
	}
	
	
}
