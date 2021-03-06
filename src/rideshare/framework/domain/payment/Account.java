package rideshare.framework.domain.payment;

import java.time.LocalDate;

public class Account {
    public int id;
    private int accountNumber;
    private String currency;
    private LocalDate startDate;
    private LocalDate endDate;
    private float interestRate;
    private String type;

    public Account() {
    }

    public Account(int id, int accountNo, String ccy, LocalDate startDate, LocalDate endDate, float interestRate, String type) {
        this.id = id;
        this.accountNumber = accountNo;
        this.currency = ccy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String ccy) {
        this.currency = ccy;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", currency=" + currency + ", startDate="
				+ startDate + ", endDate=" + endDate + ", interestRate=" + interestRate + ", type=" + type + "]";
	}    
    
}
