package threadpack;

public class ThreadDemo7 {

	public static void main(String[] args) {
		
	}
}

class ReservationCounter{
	int amt;
	public void bookTicker(int amt) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amt=amt;
		
		System.out.println(name+" is booking the ticket..: "+amt);
		System.out.println(".............");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is Given Change For the ticket..: "+(amt-100));
	}
}
