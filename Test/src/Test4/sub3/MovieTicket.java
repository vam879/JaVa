package Test4.sub3;

public class MovieTicket {
	
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTile, String scrrenTime, String seatNumber) {
		this.movieTitle  = movieTitle;  
		this.screenTime  = screenTime;
		this.seatNumber  = seatNumber;
		this.isBooked  = isBooked;
	}
	
	public void bookTicket() {
		
		if(this.isBooked) {
			System.out.println("이미 예매됨");
			return;
		}
		
		this.isBooked = true;
		System.out.println(movieTitle +", " + screenTime + ", " seatNumber + ", " isBooked);
	}
	
	public void cancleBook() {
		this.isBooked = false;
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + this.movieTitle);
		System.out.println("상영시간 : " + this.screenTime);
		System.out.println("좌석번호 : " + this.seatNumber);
		System.out.println("예약번호 : " + (this.isBooked ? "YES" : "NO"));
	}

}
