package com.dhiva.design;

public class TicketValidationMachine {

	 	private float timeIn;
	    private float timeOut;
	    private Ticket ticket;
	    private User user;
	    private int space;
	    private float duration;
	    private float cost;
	    
	    public TicketValidationMachine(User user){
	    	this.user = user;
	    	ticket = new Ticket();
	    }
	    
	    public Ticket provideTickets(){
	        ticket.setTime(timeIn);
	        ticket.setType(user.getSizeRequired());
	        return ticket;
	    }
	    
	    public void acceptTickets(Ticket ticket){
	        //accepts tickets
	        timeIn = ticket.getTime();
	        timeOut = getCurrentTime();
	        
	        processTicket();
	    }
	    
	    private float getCurrentTime() {
			return 0;
		}

		private void processTicket(){
	        //calculate total duration
	        this.duration = timeIn - timeOut;
	        cost = space*duration;
	    }
		
		private float getCost(){
			return this.cost;
		}
	    
	    public float getTotalDuration(){
	        return this.duration;
	    }
	}

