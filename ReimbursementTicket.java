package com.expense.model;

import java.util.Objects;

public class ReimbursementTicket {
	
	//Fields that match PostgresQL columns
	private int amount;
	private String description;
	private int ticketId;


	public ReimbursementTicket(int amount, String description, int ticketId) {
		super();
		this.amount = amount;
		this.description = description;
		this.ticketId = ticketId;
	}
	
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	

@Override
public int hashCode() {
	return Objects.hash(amount, description, ticketId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ReimbursementTicket other = (ReimbursementTicket) obj;
	return amount == other.amount && Objects.equals(description, other.description) && ticketId == other.ticketId;
}

@Override
public String toString() {
	return "ReimbursementTicket [amount=" + amount + ", description=" + description + ", ticketId=" + ticketId + "]";
}

}
