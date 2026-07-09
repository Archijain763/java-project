class MovieTicket{
	private String MovieName;
	private double Ticketprice;
	private double numberofTickets ;
	//setters
	public void setMovieName(String MovieName ) {
		this.MovieName = MovieName;
}
	public void setTicketprice(double Ticketprice ) {
		this.Ticketprice = Ticketprice;
	}
	public void setnumberofTickets(double numberofTickets ) {
		this.numberofTickets = numberofTickets;
	}
	// getters 
	public String getMovieName() {
		return MovieName;
	}
	public double getTicketprice() {
		return Ticketprice;
	}
	public double  getnumberofTickets() {
		return numberofTickets;
	}
	public double gettotalcost() {
		double totalcost = Ticketprice * numberofTickets;
		if(numberofTickets>5) {
			totalcost = totalcost - (totalcost*5/100);
		}
		return totalcost;
	}
}
public class movie{
	public static void main(String[] args) {
		MovieTicket a = new MovieTicket();
		a.setMovieName("Dhurandhar");
		a.setTicketprice(200.0);
		a.setnumberofTickets(7.0);
		System.out.println("movie name:"+ a.getMovieName());
		System.out.println("Ticketprice:"+ a.getTicketprice());
	    System.out.println("NO.of tickets:"+ a.getnumberofTickets());
	    System.out.println("total cost:"+ a.gettotalcost());
	}

	}

