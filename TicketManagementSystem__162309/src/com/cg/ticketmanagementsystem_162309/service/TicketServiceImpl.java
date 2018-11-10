package com.cg.ticketmanagementsystem_162309.service;

import java.util.Map;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.dao.ITicketDAO;
import com.cg.ticketmanagementsystem_162309.dao.TicketDAOImpl;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;

public class TicketServiceImpl implements ITicketService {
	ITicketDAO ticketDao = new TicketDAOImpl();

	@Override
	public Map<String, String> getTicketCategoryEntries() throws TicketException{
		// TODO Auto-generated method stub
		return ticketDao.getTicketCategoryEntries();
	}

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException {
		// TODO Auto-generated method stub
		return ticketDao.raiseNewTicket(ticketBean);
	}

	
}
