package com.expense.model;

import java.util.Objects;

public class TicketStatus {

	//Fields that match PostgresQL columns
	String Approved;
	String Denied;
	String TicketStatus;
	
	public TicketStatus() {
		super();
	}
	
	public TicketStatus(String Approved, String Denied, String TicketStatus) {
		super();
		this.Approved = Approved;
		this.Denied = Denied;
		this.TicketStatus = TicketStatus;
		
	}
	public String getTicketStatus() {
	return TicketStatus;
	}
	
	public void setTicketStatus(String TicketStatus) {
		this.TicketStatus = TicketStatus;
	}
	
	public String getApproved() {
		return Approved;
	}
	
	public void setApproved(String Approved) {
		this.Approved = Approved;
	}
	
	public String getDenied() {
		return Denied;
	}
	
	public void setDenied(String Denied) {
		this.Denied = Denied;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Approved, Denied, TicketStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketStatus other = (TicketStatus) obj;
		return Objects.equals(Approved, other.Approved) && Objects.equals(Denied, other.Denied)
				&& Objects.equals(TicketStatus, other.TicketStatus);
	}

	@Override
	public String toString() {
		return "TicketStatus [Approved=" + Approved + ", Denied=" + Denied + ", TicketStatus=" + TicketStatus + "]";
	}

}
