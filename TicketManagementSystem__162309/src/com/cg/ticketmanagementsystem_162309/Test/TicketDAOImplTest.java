package com.cg.ticketmanagementsystem_162309.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.dao.ITicketDAO;
import com.cg.ticketmanagementsystem_162309.dao.TicketDAOImpl;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;


public class TicketDAOImplTest {
	TicketBean ticketBean = new TicketBean(); 
	private static ITicketDAO ticketDao = null;
    @BeforeClass
    public static void createInstance() {
    ticketDao = new TicketDAOImpl();
    }
    @Test
    public void testRaiseNewTicket() throws TicketException {
    	ticketBean.setTicketCategoryId("tc001");
		ticketBean.setTicketNo("1234");
		ticketBean.setTicketDescription("sdidhus");
		ticketBean.setTicketPriority("low");
		ticketBean.setTicketStatus("new");
		ticketDao.raiseNewTicket(ticketBean);
		boolean res = ticketDao.raiseNewTicket(ticketBean);
		assertTrue(res);
    }
	
}
