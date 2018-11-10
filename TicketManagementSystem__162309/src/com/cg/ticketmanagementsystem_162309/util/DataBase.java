package com.cg.ticketmanagementsystem_162309.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.bean.TicketCategoryBean;

public class DataBase {
	private static Map<String, String> ticketCategory = new HashMap<String, String>();
	private static Map<String, TicketBean> ticketDetails = new HashMap<>();

	public static Map<String, String> getTicketCategoryEntries() {
		ticketCategory.put("tc001", "software installation");
		ticketCategory.put("tc002", "mailbox creation");
		ticketCategory.put("tc003", "mailbox issues");
		return ticketCategory;
	}

	public static boolean raiseNewTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		boolean isValid = false; 
		ticketDetails.put(ticketBean.getTicketNo(), ticketBean);
		isValid = true;
		return isValid;
	}

	
	

}
