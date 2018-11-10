package com.cg.ticketmanagementsystem_162309.service;

import java.util.Map;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;


public interface ITicketService {

	

	public Map<String, String> getTicketCategoryEntries() throws TicketException;

	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException;

	

	

	

}
