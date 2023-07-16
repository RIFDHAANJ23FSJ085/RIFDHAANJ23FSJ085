package closeLabBook;

public class Program15 {

	public static void main(String[] args) {
		
		int num=0;
		String primenumber="";
		
		for(int i=1;i<=100;i++) {
			int counter=0;
			
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter+=1;
				}
			}
			if(counter==2) {
				primenumber=primenumber+" "+i+"";
			}
		}
		System.out.println("Prime Number from 1 to 100");
		System.out.println(primenumber);
	}
}
