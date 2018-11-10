package com.cg.ticketmanagementsystem_162309.dao;

import java.util.Map;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;

public interface ITicketDAO {


	public Map<String, String> getTicketCategoryEntries() throws TicketException;

	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException;

	

	

	
	



}
