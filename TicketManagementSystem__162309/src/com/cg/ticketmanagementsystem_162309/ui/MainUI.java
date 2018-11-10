package com.cg.ticketmanagementsystem_162309.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.ticketmanagementsystem_162309.bean.TicketBean;
import com.cg.ticketmanagementsystem_162309.bean.TicketCategoryBean;
import com.cg.ticketmanagementsystem_162309.exception.TicketException;
import com.cg.ticketmanagementsystem_162309.service.ITicketService;
import com.cg.ticketmanagementsystem_162309.service.TicketServiceImpl;

public class MainUI {
	public static void main(String[] args) {
		ITicketService service = new TicketServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("WELCOME TO ITIMD HELP DESK");
				System.out.println("1.Raise a Ticket");
				System.out.println("2.Exit from the system");
				int ch = scanner.nextInt();
		    switch(ch)	{
		    case 1 :
		    	TicketBean ticketBean = new TicketBean();
		    	//TicketCategoryBean ticketCategoryBean = new TicketCategoryBean();
		    	Map<String, String> ticketCategory = service.getTicketCategoryEntries();
		    	//List<TicketCategory> ticketCategory1 = service.listTicketCategory();
		    	System.out.println("Select Ticket Category From below list:");
				int count = 1;
					for(Map.Entry<String, String> entrySet : ticketCategory.entrySet()) {
						System.out.println(count+": " + entrySet.getValue());
						count++;
					}
					System.out.println("Enter option");
					int choice = scanner.nextInt();
					int count1 = 1;
					for(Map.Entry<String, String> entrySet : ticketCategory.entrySet()) {
						if(count1 == choice) {
						System.out.println(count1+": " + entrySet.getValue());
						ticketBean.setTicketCategoryId(entrySet.getKey());
						}
						count1++;
					}
					//Generate ticketNo
					int id = (int) (Math.random()*10000);
					String ticketNo = Integer.toString(id);
					ticketBean.setTicketNo(ticketNo);
					//set Description 
					System.out.println("Enter Description related to issue");
					scanner.nextLine();
					String ticketDescription = scanner.nextLine();
					ticketBean.setTicketDescription(ticketDescription);
					//set priority
					System.out.println("Enter priority");
					System.out.println("1.low" +" " +  "2.medium" + " "+ "3.high");
					int choicePriority = scanner.nextInt();
					if(choicePriority == 1 ) {
						ticketBean.setTicketPriority("low");
					}
					if(choicePriority == 2 ) {
						ticketBean.setTicketPriority("medium");
					}
					if(choicePriority == 2 ) {
						ticketBean.setTicketPriority("high");
					}
					service.raiseNewTicket(ticketBean);
					//setting date and time
					LocalDateTime ldt = LocalDateTime.now();
					DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh : mm a");
					System.out.println("Ticket Number" + " "+ticketNo + " "+"logged Successfully at" +" " +ldt.format(f));
		            break;
		    case 2:
		    	
		    	System.exit(0);
		    
		      }
			
		   }
		} 
	    catch (TicketException ticketException) {
			System.out.println("Error in fetching details and adding data");
		 
		}catch (Exception e) {
			System.out.println(" internal error. try later.");
		}
		
}
}
