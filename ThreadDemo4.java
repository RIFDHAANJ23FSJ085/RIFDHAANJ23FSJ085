package threadpack;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Kitchen kitchen=new Kitchen();
		kitchen.prepareFood();
	}
}

class Kitchen{
	public void prepareFood() {
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		es.execute(()->{
			LocalTime lt1=LocalTime.now();
			System.out.println("Start Time..: "+lt1);
			
			Briyani briyani=new Briyani();
			briyani.makeBriyani();
			
			
			LocalTime lt2=LocalTime.now();
			System.out.println("Start Time..; "+lt2);
			
			System.out.println("Time Take to Make food..: ");
		});
		
		es.execute(()->{
			Chutney chutney=new Chutney();
			chutney.makeChutney();
			
		});
		es.execute(()->{
			sweet sweet=new sweet();
			sweet.makeSweet();
		});
		es.shutdown();
	}
}

class Briyani{
	public void makeBriyani() {
		System.out.println("Briyani Preparation started...");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {		}
	
	System.out.println("uses Kitch For Briyani Preparation...");
	System.out.println("briyani Ready...");
	
	try {
		Thread.sleep(10000);
	}catch(Exception e) {}
	}
}


class Chutney{
	public void makeChutney() {
		System.out.println("Chutney Preparation Ready..");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println("Uses Kitchen For chutney Preparation...");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println("Chutney ready..");
	}
}

class sweet{
	public void makeSweet() {
		System.out.println("Sweet Preparation Started...");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println("uses Kitchen For Sweet Preparation..");
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		
	}
	System.out.println("Sweet Ready...");
	}
	
}
