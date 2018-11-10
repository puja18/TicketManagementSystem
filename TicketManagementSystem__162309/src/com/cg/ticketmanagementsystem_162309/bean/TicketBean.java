package com.cg.ticketmanagementsystem_162309.bean;

public class TicketBean {
	private String ticketNo;
	private String ticketCategoryId;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus = "new";
	private String itimdComments;
	
	
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getTicketCategoryId() {
		return ticketCategoryId;
	}
	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	
	public String getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getItimdComments() {
		return itimdComments;
	}
	public void setItimdComments(String itimdComments) {
		this.itimdComments = itimdComments;
	}
	
	
 
}
