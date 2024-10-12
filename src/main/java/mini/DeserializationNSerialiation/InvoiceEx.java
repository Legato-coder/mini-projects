package mini.DeserializationNSerialiation;

public class InvoiceEx {

	private String invoiceID;
	private String paidAmt;
	private String CustomerName;
	private String CustomerEmail;
	private String CustomerNo;

	// getters N setters
	// toString Method
	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public String getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(String paidAmt) {
		this.paidAmt = paidAmt;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerNo() {
		return CustomerNo;
	}

	public void setCustomerNo(String customerNo) {
		CustomerNo = customerNo;
	}

	@Override
	public String toString() {
		return "InvoiceEx [invoiceID=" + invoiceID + ", paidAmt=" + paidAmt + ", CustomerName=" + CustomerName
				+ ", CustomerEmail=" + CustomerEmail + ", CustomerNo=" + CustomerNo + "]";
	}

}
