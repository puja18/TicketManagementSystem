package com.cg.ticketmanagementsystem_162309.dao;

import java.util.Map;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;
import com.cg.ticketmanagementsystem_162309.util.DataBase;

public class TicketDAOImpl implements ITicketDAO {

	@Override
	public Map<String, String> getTicketCategoryEntries() throws TicketException {
		// TODO Auto-generated method stub
		return DataBase.getTicketCategoryEntries();
	}

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException {
		// TODO Auto-generated method stub
		return DataBase.raiseNewTicket(ticketBean) ;
	}

	
}
